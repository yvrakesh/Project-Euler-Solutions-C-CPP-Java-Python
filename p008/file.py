t = int(input())
for i in range(t):
    n,k = input().split()
    n,k = int(n),int(k)
    s = input()
    a = []
    for i in range(n):
        a.append(int(s[i]))
    req = 0
    for i in range(n-k):
        num = 1
        for j in range(k):
            num *= a[i+j]
        if req<num:
            req = num
    print(req)
'''Explanation:
    As the input number is as big as 1000 digit there is no data type to store that as an integer.
    So we take the whole input as string and take each character and convert it to integer.
    Then two loops for finding product of adjacent k digits and finding max of them
'''