This implementation is for testing a java program containing two classes: Formatter and Utils using Junit4.

Detected faults in each method:
Formatter Class:
formatAsFileSize method:
input = Long.MAX_VALUE
expected output = 8589934591.99 GB
actual output = 8.58 GB

---------------

input = -1 (negative number) 
expected output = error
actual output = -1 B
formatAsTimeLength method:
