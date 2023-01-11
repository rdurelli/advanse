FROM openjdk:17-alpine
MAINTAINER rafaeldurelli
VOLUME /app
COPY target/learningk8s_advanse-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]