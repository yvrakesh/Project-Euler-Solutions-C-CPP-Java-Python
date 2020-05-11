def gcd(a,b):
    if a == 0:
        return b
    return gcd(b%a,a)
t = int(input())
for i in range(t):
    n = int(input())
    r = 1
    for i in range(2,n+1):
        r *= i//gcd(r,i)
    print(r)    

#Explanation:
#    The smallest number that is divisible by a set of numbers is called Least Common Multiple(LCM) of those numbers.
#    LCM(a,b) = a*b/GCD(a,b)
#    LCM(a,b,c,d,e,...z) = LCM(LCM(LCM(LCM.....(LCM(a,b),c),d)....))
#    Please note that r = r*(i/gcd(r,i)) is different from r = (r*i)/gcd(r,i) because r,i are very huge that their product may change the data type.