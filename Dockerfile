FROM openjdk:8
EXPOSE 8080
ARG JAR_FILE=/target/*.jar
ADD ${JAR_FILE} myapp.jar
ENTRYPOINT ["java","-jar","myapp.jar"]
ARG BUILD_NUMBER=1.0
