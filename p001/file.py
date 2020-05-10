for i in range(int(input())):
    n = int(input())-1
    a,b,c = int(n/3),int(n/5), int(n/15)
    print(int(int(a*(a+1)*3-c*(c+1)*15+b*(b+1)*5)>>1))


#EXPLANATION:
#    No. of numbers that are multiples of k are floor(n/k)
#    The numbers are k,2k,3k,.....(n/k)*k
#    Hence their sum is k+2*k+3*k+....+(n/k)*k
#    k(1+2+3+.....(n/k))
#    k*((n/k)*(n/k+1))/2
#    (k*(n/k)*(n/k+1))>>1    //right shift