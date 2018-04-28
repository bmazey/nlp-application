FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY *.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8090

