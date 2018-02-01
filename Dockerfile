FROM openjdk:8
EXPOSE 8080
ADD target/timeservice-*.jar /opt/timeservice/timeservice.jar
CMD ["java","-jar","/opt/timeservice/timeservice.jar", "server"]
