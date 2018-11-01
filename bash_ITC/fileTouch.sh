#!/bin/bash
#Creat file in Desktop
read fileNumber
counter=1
until [ $counter -gt $fileNumber ]
do
  cd ~/Desktop
  touch file$counter
  counter=$(( counter + 1 ))
done

