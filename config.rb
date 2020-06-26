require 'govuk_tech_docs'

require "govuk_tech_docs/table_of_contents/heading_tree_builder"
require "govuk_tech_docs/table_of_contents/heading_tree_renderer"
require "govuk_tech_docs/table_of_contents/heading_tree"
require "govuk_tech_docs/table_of_contents/heading"
require "govuk_tech_docs/table_of_contents/headings_builder"
require 'govuk_tech_docs/tech_docs_html_renderer'

require 'middleman-core/logger';

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
      logger.warn("EJ multi_page_table_of_contents")
      resources = resources
      .select { |r| r.path.end_with?(".html") && (r.parent.nil? || r.parent.url == home_url) }
      .sort_by { |r| [r.data.weight ? 0 : 1, r.data.weight || 0] }

      logger.warn(resources)
      render_page_tree(resources, current_page, config, current_page_html)
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
