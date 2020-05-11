import math
for i in range(int(input())):
    n = int(input())
    for j in range(2,int(math.sqrt(n))+1):
        while n%j is 0:
            ans = j
            n = int(n/j)
    if n>1:
        ans = n
    print(int(ans))