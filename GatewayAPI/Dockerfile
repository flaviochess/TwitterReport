FROM openjdk:8-jre-alpine

RUN mkdir -p /app
WORKDIR /app

COPY ./target/GatewayAPI-1.0.0.jar ./app.jar

CMD java -jar -Dspring.profiles.active=docker app.jar
