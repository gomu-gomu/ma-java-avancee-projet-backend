#!/bin/sh

tag="0.0.1"
username="gomu-gomu"
project="ma-java-avancee-projet-backend"
image="$username/$project:$tag"

docker build -f ./docker/Dockerfile -t $image .
docker run -it --rm -v "$(pwd)":/app -p 8080:8080 $image