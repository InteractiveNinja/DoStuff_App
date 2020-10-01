#!/bin/bash

if [ ! -d "target" ]; then
mvn install
fi
screen -mS doStuff java -jar target/dostuff-web-1.0.0.jar --spring.config.location=target/classes/application.properties
