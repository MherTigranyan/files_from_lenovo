#!/bin/bash
#find the root of the number
read number
counter=0
until [ $(( counter * counter )) -ge $number ]
do
  counter=$(( counter + 1 ))
done

if [ $(( counter * counter )) -eq $number ]
  then
    echo $counter
fi
if [ $(( counter * counter )) -gt $number ]
 then
   armat=$(( counter - 1 ))
   mnacord=$(( number - armat * armat))
   echo "$armat√$mnacord"
fi

