FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/zipkin-server.jar zipkin-server.jar
ENTRYPOINT ["java","-jar","/zipkin-server.jar"]
