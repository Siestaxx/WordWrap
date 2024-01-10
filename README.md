# WordWrap
## Description
For this project, you are asked to implement a very specific form of word wrapping. You
will not hyphenate or break any words. Instead, you will simply accumulate tokens (words)
into a buffer and print the buffer whenever adding the next token would cause it to grow
past the allowed length. Very long tokens (longer than the maximum width) should be
printed on a line by themselves. Redundant whitespace between words (e.g., extra spaces
or tabs) should be removed. Blank lines (or lines containing only whitespace) should be
preserved (as completely blank lines). The user will specify the maximum width as the
first line of input, which will be a positive integer. The user will specify the end of input
by typing “Stop.” alone on a line. Your program will then print the entire word wrapped
data. 
## Implementation
First, we need to set the width, which is to let the user to set the number, so use the scanner first. After that, we need to initialize, and I used the boolean to as a condition of judgement. Then, we use the while loop and enter the string line by line. First, if we detect that “Stop.”  is on a single line , then we just print out our input, with the string operation. Then, we see the next if, it is the blank line. No matter the length of the blank line (spaces) is less than the maxsize, it will start a next line because the blank line will be put into the output, as a result, input += “\n”; starts a new line after the blank line and the flag becomes true and the length, which represent the length of the line, since it starts a new line, becomes 0. The next is deal length that is >= max size. First is the super long tokens, we used the boolean flag, if it is false, then we start a new line to proceed this token, and after the token on a single line is printed, we get a new line, boolean flag is true and the new line length becomes 0. The else statement is when the the single line, but not super long tokens, exceed the max size that user determined, then form a new line that print the  words that is longer than the max size, and get a new length. The last else statement is the condition when length < maxsize but it turned to new line.In the if, we add the input string, and the flag assignment to false to go to the else statement, since the two lines are short and combine to one line, then we must add a space to combine, so it is " " + str;, and then, since it is a more space, the length become length++.
