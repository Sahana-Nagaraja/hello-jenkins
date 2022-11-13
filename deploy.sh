#!/usr/bin/env bash

NAME=`mvn help:evaluate -Dexpression=project.name | grep "^[^\[]"`
VERSION=`mvn help:evaluate -Dexpression=project.version | grep "^[^\[]"`
java -jar -Dspring.profiles.active="$1" target/${NAME}-${VERSION}.jar