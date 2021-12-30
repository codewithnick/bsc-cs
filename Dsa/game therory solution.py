from math import *
arr=[1,5,6,4,5,4]
l=0
r=len(arr)-1

def gt(arr,l,r,lev):
    print(lev*' ',arr[l],' or ',arr[r])
    #print(arr,l,r)
    if(l+1==r):
        return max(arr[l],arr[r])
    #if left pickup
    a= arr[l]+gt(arr,l+1,r,lev+1)
    #if rightpickup
    b= arr[r]+gt(arr,l,r-1,lev+1)
    if(len(arr)%2!=0):
        #my turn
        x=max(a,b)
        #print (x)
        return max(a,b) 
    else:
        #opponent turn
        x=min(a,b)
        #print (x)
        return min(a,b) 
print(gt(arr,l,r,0))
    
