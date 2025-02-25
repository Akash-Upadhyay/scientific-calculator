#!/bin/bash
#clear  # Clears the screen for a fresh start
## Ensuring output is immediately displayed
#echo -e "Scientific Calculator"
#echo -e "1. Square Root (√x)"
#echo -e "2. Factorial (x!)"
#echo -e "3. Natural Log (ln(x))"
#echo -e "4. Power Function (x^b)"
#echo -e "5. Exit\n"
#
## Ensure immediate output in a Docker container or shell
#stdbuf -o0 echo "Choose an option: "

java -jar /app/scientific-calculator.jar


