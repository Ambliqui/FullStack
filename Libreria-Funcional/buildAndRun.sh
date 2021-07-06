#!/bin/sh
mvn clean package && docker build -t com.arelance/Libreria .
docker rm -f Libreria || true && docker run -d -p 9080:9080 -p 9443:9443 --name Libreria com.arelance/Libreria