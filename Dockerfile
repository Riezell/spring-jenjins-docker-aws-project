FROM openjdk:17
COPY /target/projectphase6.jar .
CMD ["java","-jar","projectphase6.jar"]