FROM openjdk

RUN mkdir /app

COPY app.jar /app/app.jar

COPY dependency /app/dependency

CMD java -jar /app/app.jar