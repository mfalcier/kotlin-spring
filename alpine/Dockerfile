FROM maven:3.5-jdk-8

USER root

COPY ./code/ /home
WORKDIR /home

RUN mvn clean install
