maxi=0
cmp=[]
def getLarge(a,b):
    global cmp
    if a > b:
        cmp.append(b)
        return a
    elif a < b:
        cmp.append(a)
        return b
    else:
        return a
def Max(array,start,end):
    global maxi
    mid= int((start+end)/2)
    if end-start > 2:
        Max(array,start,mid)
        Max(array,mid,end)
    else:
        array=array[start:end]
        if end-start==1:
            array.append(array[0])
        maxi=getLarge(maxi,getLarge(array[0],array[1]))
array=[]
length= int(input("Enter the array size: "))
for x in range(0,length):
    array.append(int(input("Enter element: ")))
print("The array:  ", array)
Max(array,0,length)
print("The highest element is: ",maxi)
print("The second highest element is: ",max(cmp))
