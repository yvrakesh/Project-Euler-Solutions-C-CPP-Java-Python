import math
def isPrime(n):
    for i in range(3,int(math.sqrt(n))+1,2):
        if n%i == 0:
            return 0
    return 1
a = [0,0,2]
for i in range(3,2000001,2):
        if isPrime(i):
            a.append(i)
        else:
            a.append(0)
        a.append(0)
for i in range(len(a)-1):
    a[i+1] += a[i]
t = int(input())
for i in range(t):
    print(a[int(input())])
'''Explanation:
                Firstly store each element of index i to i if it is Prime 0 otherwise.
                Then perform cumulative sum over and replace the entries with its cumulative sum.
                Thus each element at a particular index n states sum of all primes less than or equal to it.
'''