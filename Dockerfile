FROM openjdk:18-jdk-slim

ENV JAVA_HOME /usr/local/openjdk-18

ENV PATH $JAVA_HOME/bin:/usr/share/maven/bin:$PATH

RUN apt-get update && \
    apt-get install -y maven && \
    rm -rf /var/lib/apt/lists/*

WORKDIR /app
git
COPY pom.xml .

COPY src ./src

RUN mvn clean install

CMD ["java", "-jar", "target/openapi-java-client-v2018-08-01.jar"]
