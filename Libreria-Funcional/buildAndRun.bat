@echo off
call mvn clean package
call docker build -t com.arelance/Libreria .
call docker rm -f Libreria
call docker run -d -p 9080:9080 -p 9443:9443 --name Libreria com.arelance/Libreria