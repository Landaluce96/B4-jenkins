#!/bin/bash

echo "********************"
echo "*** TESTING CODE ***"
echo "********************"

WORKSPACE=/home/jenkins/jenkins-data/jenkins_home/workspace/b4-jenkins

docker run --rm -v $WORKSPACE/maven-log4j:/app -v /root/.m2:/root/.m2 -w /app maven "$@"