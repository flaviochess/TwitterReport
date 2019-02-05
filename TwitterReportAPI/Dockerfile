FROM openjdk:8-jre-alpine

RUN mkdir -p /app
WORKDIR /app

COPY ./target/TwitterReportAPI-1.0.0.jar ./app.jar

CMD java -jar -Dspring.profiles.active=docker app.jar
