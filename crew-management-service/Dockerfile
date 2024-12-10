FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/crew-management-service.jar crew-management-service.jar
ENTRYPOINT ["java","-jar","/crew-management-service.jar"]
