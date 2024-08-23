FROM ruby:3.1.4

COPY Gemfile Gemfile.lock ./app/

WORKDIR ./app

RUN bundle install

RUN apt-get update && apt-get install -y curl

RUN curl -s https://deb.nodesource.com/setup_16.x | bash - && apt-get install -y nodejs