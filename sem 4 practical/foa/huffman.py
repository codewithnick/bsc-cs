class Node:
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None
        self.freq=1
        self.huff=''
        self.code=None
    def getfreq(self):
        return self.freq
    def printNodes(node, val=''):
     
        newVal = val + str(node.huff)
        if(node.left):
            Node.printNodes(node.left, newVal)
        if(node.right):
            Node.printNodes(node.right, newVal)
        if(not node.left and not node.right):
            print(f"{node.data} -> {newVal}")
            mydict[node.data]=newVal
string=input("enter the string ")
nodesarray=[]
mydict={}
for i in string:
    node=Node(i)
    temp=[x.data for x in nodesarray]
    if i in temp:
        ind=temp.index(i)
        nodesarray[ind].freq+=1
        
    else:
        nodesarray.append(node)
        mydict[i]=""
        
        
nodesarray.sort(key=Node.getfreq)
mynodes= [x.data for x in nodesarray]
myfreq= [x.freq for x in nodesarray]
#print(temp)
#sorted

print("data ", " freq      "," huff ")
for i in nodesarray:
    print(i.data, " freq=",i.freq," huff= ",i.huff)
print(mynodes)
print(myfreq)
while len(nodesarray)>1:
    nodesarray.sort(key=Node.getfreq)
    left = nodesarray[0]
    right = nodesarray[1]
    left.huff = 0
    right.huff = 1
    newnode=Node(left.data+right.data)
    
    mynodes.insert(0,left.data+right.data)
    myfreq.insert(0,left.freq+right.freq)
    print()
    print([x.data for x in nodesarray])
    print([x.freq for x in nodesarray])
    print()

    newnode.freq=left.freq+right.freq
    newnode.left=left
    newnode.right=right
    nodesarray.remove(left)
    nodesarray.remove(right)
    nodesarray.insert(0,newnode)
Node.printNodes(newnode)
print("\n\n\n")

print(mynodes)
print(myfreq)

print(mydict)
for i in string:
    print(mydict[i],end="")
    














    
        
