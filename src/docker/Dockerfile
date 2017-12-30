FROM openjdk:8-jre-alpine
MAINTAINER Greg Whitaker <greg@netifi.com>
EXPOSE 5050
COPY build/distributions/ratpack-docker-example.zip /opt/ratpack-docker-example/
RUN unzip /opt/ratpack-docker-example/ratpack-docker-example.zip -d /opt/ratpack-docker-example
WORKDIR /opt/ratpack-docker-example/ratpack-docker-example
CMD ["./bin/ratpack-docker-example", "-fg"]