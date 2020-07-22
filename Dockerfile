From openjdk:8
copy ./target/jhipster-0.0.1-SNAPSHOT.jar etrat-warpper.jar
CMD ["java","-jar","etrat-warpper.jar"]
