#!/bin/bash -e

cd $(dirname $0)

if [ -d output ]; then
  rm -r output
fi

hadoop jar WordCountMR-1.0-SNAPSHOT.jar input output
cat output/*
