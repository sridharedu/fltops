FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/config-server.jar config-server.jar
ENTRYPOINT ["java","-jar","/config-server.jar"]
