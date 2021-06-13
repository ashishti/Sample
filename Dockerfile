FROM openjdk:8
ADD target/Spring-testing.jar Spring-testing.jar
EXPOSE 8181
ENTRYPOINT ["java","-jar","Spring-testing.jar"]
