3.5-jdk-8-alpine
MAINTAINER  Edge Team <it-edge@pixartprinting.com>

USER root

COPY        ./code/ /home
WORKDIR     /home

RUN         mvn clean install
