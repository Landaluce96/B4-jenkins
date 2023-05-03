#!/bin/bash

WORKSPACE=/var/jenkins_home/workspace/b4-jenkins

# Copy the new jar to the build location
cp -f $WORKSPACE/maven-log4j/target/*.jar jenkins/build/app.jar
cp -f -r $WORKSPACE/maven-log4j/target/dependency/ jenkins/build/

echo "*****************************"
echo "*** BUILDING DOCKER IMAGE ***"
echo "*****************************"

cd jenkins/build && docker compose -f docker-compose-build.yml build --no-cache