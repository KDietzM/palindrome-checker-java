FROM ubuntu:22.04

RUN apt-get update && apt-get install -y openjdk-17-jdk-headless
RUN apt-get apt-get install -y maven

COPY PalindromeChecker /

RUN cd PalindromeChecker
RUN  mvn package

CMD ["java", "-cp", "PalindromeChecker/target/classes", "de.ulbms.scdh.spike.git.Palindrome"]