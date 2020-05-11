def sq_root(n):
    f,l = 1,n
    while f<=l:
        mid = (l-f)//2+f
        t = mid*mid
        if t==n:
            return mid
        if t<n:
            f = mid+1
            ans = mid
        else:
            l = mid-1
    return ans
def isPrime(n):
    t = sq_root(n)
    for i in range(3,t+1,2):
        if n%i == 0:
            return 0
    return 1
a = []
a.append(2)
for i in range(3,104744,2):
    if isPrime(i) == 1:
        a.append(i)
t = int(input())
for i in range(t):
    n = int(input())
    print(a[n-1])

'''Explanation:
    Firstly find all prime numbers and store it in an array a.
    Optimizing isPrime func:
        if n%i==0 then n%(n/i) == 0 or n%i!=0 then n%(n/i)!=0
        So its enough iterating from 2 to sqrt(n).
        Except 2 no prime number is even hence we can check only odd numbers whether if prime.
        Odd numbers never have even factors.
        Hence enough iterating from 3 to sqrt(n) with increment 2
    Optimizing sq_root func:
        Here i used binary search technique to find sq_root. Because there are two things common in them.
        Binary search is used for increasingly sorted numbers and here iteration is also from 1 to root n(i.e i*i<=n) which is increasing series.
        In case you still didn't understand sq_root func then refer binary search algo in geeksforgeeks.
'''