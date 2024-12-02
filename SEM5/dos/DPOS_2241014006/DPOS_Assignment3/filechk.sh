#!/bin/bash

if [ $# -ne 2 ]; then
  echo "Error: Please provide exactly two file names as arguments."
  exit 1
fi

file1=$1
file2=$2

if cmp -s "$file1" "$file2"; then
  echo "Files $file1 and $file2 have same content."
  rm "$file2"
  echo "So $file2 is deleted."
else
  echo "Files $file1 and $file2 have different content."
fi

