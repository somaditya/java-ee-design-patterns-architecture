@echo off
call mvn clean package
call docker build -t com.linkedin/jakartaee-patterns .
call docker rm -f jakartaee-patterns
call docker run -d -p 9080:9080 -p 9443:9443 --name jakartaee-patterns com.linkedin/jakartaee-patterns