FROM openjdk:18-jdk-slim

ENV JAVA_HOME /usr/local/openjdk-18

ENV PATH $JAVA_HOME/bin:/usr/share/maven/bin:$PATH

RUN apt-get update && \
    apt-get install -y maven && \
    rm -rf /var/lib/apt/lists/*

WORKDIR /app

COPY pom.xml .

COPY .env .

COPY src ./src

COPY tests ./tests

RUN mvn clean install

RUN mvn install:install-file -Dfile=./target/openapi-java-client-v2018-08-01.jar -DgroupId=voucherify -DartifactId=java-sdk-test -Dversion=0.0.1 -Dpackaging=jar

RUN mvn -f ./tests clean install

CMD ["mvn", "-f" , "./tests", "exec:java"]
