FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY Main.java .

RUN wget https://github.com/discord-jda/JDA/releases/download/v5.3.0/JDA-5.3.0.jar
RUN wget https://repo1.maven.org/maven2/org/slf4j/slf4j-api/2.0.13/slf4j-api-2.0.13.jar
RUN wget https://repo1.maven.org/maven2/org/slf4j/slf4j-simple/2.0.13/slf4j-simple-2.0.13.jar
RUN wget https://repo1.maven.org/maven2/com/squareup/okhttp3/okhttp/4.12.0/okhttp-4.12.0.jar
RUN wget https://repo1.maven.org/maven2/com/squareup/okio/okio-jvm/3.6.0/okio-jvm-3.6.0.jar
RUN wget https://repo1.maven.org/maven2/org/jetbrains/kotlin/kotlin-stdlib/1.9.22/kotlin-stdlib-1.9.22.jar

RUN javac -cp "JDA-5.3.0.jar:slf4j-api-2.0.13.jar:okhttp-4.12.0.jar:okio-jvm-3.6.0.jar:kotlin-stdlib-1.9.22.jar" Main.java

CMD ["java","-cp",".:JDA-5.3.0.jar:slf4j-api-2.0.13.jar:slf4j-simple-2.0.13.jar:okhttp-4.12.0.jar:okio-jvm-3.6.0.jar:kotlin-stdlib-1.9.22.jar","Main"]
