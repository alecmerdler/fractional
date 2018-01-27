#!/bin/bash

docker build -t quay.io/alecmerdler/fractional:dev .
docker run -it --net=host -v $PWD:/usr/src/app quay.io/alecmerdler/fractional:dev lein ring server-headless
