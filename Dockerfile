FROM openjdk:8-jdk-alpine
COPY target/*.jar /
WORKDIR /
CMD ["java", "-jar", "/SPORTS-0.0.1-SNAPSHOT.jar"]
