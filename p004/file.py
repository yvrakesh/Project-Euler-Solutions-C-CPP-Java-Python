def reverse(n):
    temp,rev = n,0
    while temp>0:
        rev = rev*10+temp%10
        temp = int(temp/10)
    return rev
def isPallendrome(n):
    if n == reverse(n):
        return 1
    return 0
t = int(input())
for k in range(t):
    n = int(input())
    temp = 0
    for i in range(990,99,-11):
        for j in range(999,99,-1):
            req = i*j
            if req<n and isPallendrome(req):
                if(req>temp):
                    temp = req
                break
    print(temp)

#Explanation:
#        suppose abccba be the pallendrome number(Remember input constrains are for six digit numbers)
#        a*100000+b*10000+c*1000+c*100+b*10+a
#        a*100001+b*10010+c*1100
#        11*(a*9091+b*910+c*100).Hence a pallendrome number must be 11 multiple
#        Question is largest pallendrome number i.e product of two 3-digit numbers
#        Hence either of the two numbers is a 11 multiple. Hence one loop from 990 to 99 with 11 units gap.
#        Other number from 999 to 99 with 1 gap.