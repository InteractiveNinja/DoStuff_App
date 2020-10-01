@echo off
IF exist target (
echo Projekt schon gebuilded, starte
 ) ELSE (
 mvnw.cmd install
 )

java -jar target\dostuff-web-1.0.0.jar --spring.config.location=target\classes\application.properties