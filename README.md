# Technical Documentation - Fraud Prevention Guide

## Getting started

To preview or build the website, we need to use the terminal.

Install Ruby with Rubygems, preferably with a [Ruby version manager][rvm],
and the [Bundler gem][bundler].

In the application folder type the following to install the required gems:

```
bundle install
```

## Making changes

To make changes edit the source files in the `source` folder.

### Single page output

Although a single page of HTML is generated the markdown is spread across
multiple files to make it easier to manage. They can be found in
`source/documentation`.

A new markdown file isn't automatically included in the generated output. If we
add a new markdown file at the location `source/documentation/agile/scrum.md`,
the following snippet in `source/index.html.md.erb`, includes it in the
generated output.

```
<%= partial 'documentation/agile/scrum' %>
```

Including files manually like this lets us specify the position they appear in
the page.

### Multiple pages

To add a completely new page, create a file with a `.html.md` extension in the `/source` directory.

For example, `source/about.html.md` will be accessible on <http://localhost:4567/about.html>.

## Preview

Whilst writing documentation we can run a middleman server to preview how the
published version will look in the browser. After saving a change the preview in
the browser will automatically refresh.

The preview is only available on our own computer. Others won't be able to
access it if they are given the link.

Type the following to start the server:

```
bundle exec middleman server
```

If all goes well something like the following output will be displayed:

```
== The Middleman is loading
== LiveReload accepting connections from ws://192.168.0.8:35729
== View your site at "http://Laptop.local:4567", "http://192.168.0.8:4567"
== Inspect your site configuration at "http://Laptop.local:4567/__middleman", "http://192.168.0.8:4567/__middleman"
```

You should now be able to view a live preview at http://localhost:4567.

## Build

If you want to publish the website without using a build script you may need to
build the static HTML files.

Type the following to build the HTML:

```
bundle exec middleman build
```

This will create a `build` subfolder in the application folder which contains
the HTML and asset files ready to be published.

[rvm]: https://www.ruby-lang.org/en/documentation/installation/#managers
[bundler]: http://bundler.io/

## Testing

To run some basic asset generation tests, run the following command:
```
sbt 'testOnly *BuildSpec*'
```

## Running with Docker

Running `bundle install` may cause issues on some machines. Fortunately, there is an alternative by running via a Docker container.

To run the specification via Docker (with live reload), use the following command from the repository root directory (i.e., the same directory as the docker-compose.yml file):
```
docker-compose up
```

or

```
docker compose up
```

Alternatively, to build the static HTML files, run:

```
docker-compose -f docker-compose-build.yml up
```

or 

```
docker compose -f docker-compose-build.yml up
```

It is possible to run tests via the Docker containers via:
```
sbt 'testOnly *BuildWithDockerSpec*'
```

### License

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").
 