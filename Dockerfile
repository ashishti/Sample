FROM openjdk:8
ADD target/Spring-testing.jar Spring-testing.jar
EXPOSE 8181
ENTRYPOINT ["JAVA","-jar","Spring-testing.jar"]