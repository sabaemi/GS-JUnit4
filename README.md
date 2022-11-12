This implementation is for testing a java program containing two classes: Formatter and Utils using Junit4.

Detected faults in each method:

**Formatter Class:**

_formatAsFileSize method:_

| input       | expected output          | actual outpu  |
| ------------- |:-------------:| -----:|
| Long.MAX_VALUE      | 8589934591.99 GB      |   8.58 GB |
| -1 (negative number)      | error     |   -1 B |

_formatAsTimeLength method:_

| input       | expected output          | actual outpu  |
| ------------- |:-------------:| -----:|
| 7820000(number)      | 2 hour 10 minutes 20 seconds(hours+minutes+seconds)       |   2 hour 10 minutes(hours+minutes) |
| 7220010(number)      | 2 hour 20 seconds 10 milli seconds(hours+ seconds+milliseconds)       |   2 hour 20 minutes(hours+minutes) |
| 620010(number)      | 10 minutes 20 seconds 10 milli seconds(minutes+seconds+milliseconds)       |   10 minutes 20 seconds(minutes+seconds) |
| 20010(number)      | 20 seconds 10 milli seconds(seconds+milliseconds )       |   20 seconds(seconds) |
| negative number      | IllegalArgumentExcetion     |   number |

**Utils Class:**

_isValidEmailAddress method:_

| input       | expected output          | actual outpu  |
| ------------- |:-------------:| -----:|
| 1@(unvalid email)     | false      |   true |
| s@..(unvalid email)      | false      |   true |

_getCount method:_

| input       | expected output          | actual outpu  |
| ------------- |:-------------:| -----:|
| "",""(both empty)      | test less than 50 milliseconds       |   test 119 milliseconds |
| "aaaa","aa"     | 3       |   2 |

_longestCommonSubstring method:_

| input       | expected output          | actual outpu  |
| ------------- |:-------------:| -----:|
| "ll",null     | not throwing exception      |   NullPointerException |
