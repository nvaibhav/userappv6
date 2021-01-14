FROM openjdk:8-jdk-alpine

WORKDIR /usr/userapp

COPY userapp-0.0.1-SNAPSHOT.jar userapp.jar

ENTRYPOINT ["java","-jar","userapp.jar"]
