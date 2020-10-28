# Start with a base image - in this case JDK 8 Alpine
FROM openjdk:8
EXPOSE 8080
ADD target/api.jar api.jar
COPY ${JAR_FILE} app.jar
# Set ENTRYPOINT in exec form to run the container as an executable
ENTRYPOINT ["java","-jar","/api.jar"]
