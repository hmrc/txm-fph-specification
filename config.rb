require 'govuk_tech_docs'

# require "govuk_tech_docs/path_helpers"
require "govuk_tech_docs/table_of_contents/heading_tree_builder"
require "govuk_tech_docs/table_of_contents/heading_tree_renderer"
require "govuk_tech_docs/table_of_contents/heading_tree"
require "govuk_tech_docs/table_of_contents/heading"
require "govuk_tech_docs/table_of_contents/headings_builder"
require 'govuk_tech_docs/tech_docs_html_renderer'

configure :build do
  base_path = ENV['BASE_PATH'] || '/' # Note: please ensure BASE_PATH ends with a trailing '/'

  activate :asset_host, host: base_path
  config[:http_prefix] = base_path

  module GovukTechDocs::TableOfContents::Helpers

    def multi_page_table_of_contents(resources, current_page, config, current_page_html = nil)
      # Only parse top level html files
      # Sorted by weight frontmatter
      home_url =
           if config[:http_prefix].end_with?("/")
             config[:http_prefix]
           else
             config[:http_prefix] + "/"
           end
      resources = resources
      .select { |r| r.path.end_with?(".html") && (r.parent.nil? || r.parent.url == home_url) }
      .sort_by { |r| [r.data.weight ? 0 : 1, r.data.weight || 0] }

      logger.warn(resources)
      render_page_tree(resources, current_page, config, current_page_html)
    end

    def render_page_tree(resources, current_page, config, current_page_html)
      # Sort by weight frontmatter
      resources = resources
      .sort_by { |r| [r.data.weight ? 0 : 1, r.data.weight || 0] }

      output = "<ul>\n"
      resources.each do |resource|
        # Skip from page tree if hide_in_navigation:true frontmatter
        next if resource.data.hide_in_navigation

        # Reuse the generated content for the active page
        # If we generate it twice it increments the heading ids
        content = current_page.url == resource.url && current_page_html ? current_page_html : resource.render(layout: false)
        # Avoid redirect pages
        next if content.include? "http-equiv=refresh"

        # If this page has children, just print the title and recursively
        # render the children. If not, print the heading structure.

        # We avoid printing the children of the root index.html as it is the
        # parent of every other top level file.  We need to take any custom
        # prefix in to consideration when checking for the root index.html.
        # The prefix may be set with or without a trailing slash: make sure
        # it has one for this comparison check.
        home_url =
          if config[:http_prefix].end_with?("/")
            config[:http_prefix]
          else
            config[:http_prefix] + "/"
          end

        link_value = get_path_to_resource(config, resource, current_page)
        if resource.children.any? && resource.url != home_url
          title =
            if !resource.data.display_title.nil?
              resource.data.display_title
            else
              resource.data.title
            end
          output += %{<li><a href="#{link_value}"><span>XXX</span></a>\n}
#           output += %{<li><a href="#{link_value}"><span>#{title}</span></a>\n}
          output += render_page_tree(resource.children, current_page, config, current_page_html)
          output += "</li>\n"
        else
          output +=
            list_items_from_headings(
              content,
              url: link_value,
              max_level: config[:tech_docs][:max_toc_heading_level],
            )
        end
      end
      output += "</ul>\n"
      output
    end

    def get_path_to_resource(config, resource, current_page)
      if config[:relative_links]
        resource_path_segments = resource.path.split("/").reject(&:empty?)[0..-2]
        resource_file_name = resource.path.split("/")[-1]

        path_to_site_root = path_to_site_root config, current_page.path
        resource_path = path_to_site_root + resource_path_segments
                                           .push(resource_file_name)
                                           .join("/")
      else
        resource_path = resource.url
      end
      resource_path
    end
  end

  module GovukTechDocs::TableOfContents
    class Heading
      def href
        @element_name == 'h1' ? @page_url : @page_url + '#' + @attributes['id']
      end
    end
  end
end

GovukTechDocs.configure(self)

class ApiTechDocsHTMLRenderer < GovukTechDocs::TechDocsHTMLRenderer
  alias_method :old_header, :header

  def header(text, level)
    %(#{old_header(text, level)}\n)
  end
end

set :markdown,
   renderer: ApiTechDocsHTMLRenderer.new(
      with_toc_data: true,
      api: true,
      link_attributes: { rel: 'noopener noreferrer' },
      context: self
    ),
    fenced_code_blocks: true,
    tables: true,
    no_intra_emphasis: true
