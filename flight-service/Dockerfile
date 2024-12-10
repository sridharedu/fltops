FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/flight-service.jar flight-service.jar
ENTRYPOINT ["java","-jar","/flight-service.jar"]
