sudo chmod +x mvnw
sh mvnw install
screen -mS doStuff java -jar target/dostuff-web-1.0.0.jar --spring.config.location=target/classes/application.properties
