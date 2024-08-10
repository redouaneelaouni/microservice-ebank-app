FROM openjdk:17-oracle
VOLUME /enset
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]