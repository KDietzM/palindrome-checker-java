FROM ubuntu:22.04

RUN apt-get update && apt-get install -y openjdk-17-jdk-headless
RUN apt-get install -y maven

COPY * /

RUN  mvn package

CMD ["java", "-cp", "target/classes", "de.ulbms.scdh.spike.git.Palindrome"]