def quickSort(a,start,end):
    if start<end:
        loc=partition(a,start,end)
        quickSort(a,start,loc)
        quickSort(a,loc+1,end)
def partition(a,start,end):
    pivot = a[start]
    left=start+1
    loc=end
    flag=0
    while flag!=1:
        while left <= loc and a[left]<=pivot:
            left=left+1
        while a[loc]>=pivot and loc>=left:
            loc=loc-1
        if loc<left:
            flag=1
        else:
            temp=a[left]
            a[left]=a[loc]
            a[loc]=temp
    temp=a[start]
    a[start]=a[loc]
    a[loc]=temp
    return loc
a=[]
n=int(input("Enter the number of elements: "))
while(n>0):
    name=input("Enter the name: ")
    a.append(name)
    n=n-1
print("Original list is\n",a)
quickSort(a,0,len(a)-1)
print("Sorted list is\n",a)
