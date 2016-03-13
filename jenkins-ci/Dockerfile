FROM jenkins

USER root
COPY tools/executors.groovy /usr/share/jenkins/ref/init.groovy.d/executors.groovy
COPY tools/plugins.txt /usr/share/jenkins/plugins.txt
RUN /usr/local/bin/plugins.sh /usr/share/jenkins/plugins.txt

RUN apt-get -y update && apt-get -y install maven

USER jenkins


