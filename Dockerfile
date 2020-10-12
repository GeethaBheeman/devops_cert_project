FROM devopsedu/webapp

ARG DEBIAN_FRONTEND=noninteractive

RUN apt-get update

RUN apt-get -y install apache2

ADD PHP_Website/ /var/www/html

ENTRYPOINT apachectl -D FOREGROUND

ENV name DEVOPS
