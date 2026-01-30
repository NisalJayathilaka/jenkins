FROM openjdk:17-jdk-slim
Expose 1234
copy target/jenkins-0.0.1-SNAPSHOT.jar /jenkins-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/jenkins-0.0.1-SNAPSHOT.jar"]
