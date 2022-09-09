#!/bin/sh
mvn clean package && docker build -t com.linkedin/jakartaee-patterns .
docker rm -f jakartaee-patterns || true && docker run -d -p 9080:9080 -p 9443:9443 --name jakartaee-patterns com.linkedin/jakartaee-patterns