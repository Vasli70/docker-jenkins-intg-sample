# Start with a base image - in this case JDK 8 Alpine
FROM openjdk:8
EXPOSE 8080
ADD target/docker-jenkins-integration.jar docker-jenkins-integration.jar
# Set ENTRYPOINT in exec form to run the container as an executable
ENTRYPOINT ["java","-jar","/docker-jenkins-integration.jar"]
