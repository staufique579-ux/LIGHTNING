FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY Main.java .

RUN wget https://github.com/discord-jda/JDA/releases/download/v5.3.0/JDA-5.3.0.jar

RUN javac -cp JDA-5.3.0.jar Main.java

CMD ["java", "-cp", ".:JDA-5.3.0.jar", "Main"]
