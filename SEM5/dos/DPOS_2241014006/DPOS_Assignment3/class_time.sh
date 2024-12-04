#!/bin/bash

echo "Enter a day:"
read day

case $day in
  Monday)
    echo "DOS class time: 10:00 AM - 11:00 AM, C-111"
    ;;
  Tuesday)
    echo "DOS class time: 5:00 PM - 6:00 PM, C-111"
    ;;
  Wednesday)
    echo "DOS class time: 3:00 PM - 4:00 PM, C-111"
    ;;
  Thursday)
    echo "DOS class time: 11:00 AM - 1:00 PM, C-230"
    ;;
  Friday)
    echo "No class on $day"
    ;;
  Saturday)
    echo "No class on $day"
    ;;
  Sunday)
    echo "Holiday"
    ;;
  *)
    echo "Invalid day entered"
    ;;
esac
#end 
#output in outputs.md 
