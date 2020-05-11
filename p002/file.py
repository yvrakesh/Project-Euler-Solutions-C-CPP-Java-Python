a,b = 1,2
v = []
v.append(2)
x = pow(10,17)
while True:
    i = a+b
    if i%2 is 0:
        v.append(i)
    a,b = b,i
    if i>=x:
        break
for i in range(int(input())):
    n = int(input())
    s = 0
    for j in v:
        if j<n:
            s += j
    print(s)
# Explanation: Firstly found all the even fibonacci numbers and stored in list v.Then summation of all elements of array until that input number.