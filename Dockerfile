FROM eclipse-temurin:17-jdk-jammy
Expose 1234
copy target/jenkins-0.0.1-SNAPSHOT.jar /jenkins-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/jenkins-0.0.1-SNAPSHOT.jar"]
