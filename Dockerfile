FROM openjdk:17
EXPOSE 8080
ADD target/simple-deployment-0.0.1-SNAPSHOT.jar simple-deployment-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/simple-deployment-0.0.1-SNAPSHOT.jar"]