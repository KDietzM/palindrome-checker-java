FROM ubuntu:22.04

RUN apt-get update && apt-get install -y openjdk-17-jre-headless

COPY target/*.jar .


CMD ["java", "-cp", "git-spike-0.1.0.jar", "de.ulbms.scdh.spike.git.Palindrome"]