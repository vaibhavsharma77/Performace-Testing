FROM openjdk:8-alpine
ADD target/product-service.jar product-service.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","product-service.jar"]

