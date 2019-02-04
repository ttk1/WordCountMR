#!/bin/bash

hadoop jar WordCountMR-1.0-SNAPSHOT.jar input output
cat output/*
rm -r output