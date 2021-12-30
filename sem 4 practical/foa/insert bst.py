from drawtree import draw_bst
class Node:
    def __init__(self,key):
       self.left= None
       self.right= None
       self.data=key


def insert(root,data):
    if root == None:
        root=Node(data)
        return root
    
    if data <root.data:
        #call left
        root.left=insert(root.left,data)
        
    elif data >root.data:
        #call right
        root.right=insert(root.right,data)
    else:
        print("element already inside")
    return root
def minNode(root, data):
    if root==None:
        return None
    curr=root
    while curr.left!=None:
        curr=curr.left    
    return curr.data
def maxNode(root, data):
    if root==None:
        return None
    curr=root
    while curr.right!=None:
        curr=curr.right    
    return curr.data
    
def delete(root,data):
    if root==None:
        return
    if data <root.data:
        #call left
        root.left=delete(root.left,data)        
    elif data >root.data:
        #call right
        root.right=delete(root.right,data)
    else:
        #data matched
        if root.right==None and root.left==None:
            return None
        elif root.left!=None:
            #left is not empty
            root.data=maxNode(root.left,data)
            root.left=delete(root.left,root.data)
            
        else:
            root.data=minNode(root.right,data)
            root.right=delete(root.right,root.data)            
    return root
            
            
def inorder(root):
    if root is not None:
        inorder(root.left)
        print(root.data)
        inorder(root.right)
order=[]
r=int(input('Enter the root node of your tree: '))
tree=[r]
draw_bst(tree)
r=Node(r)
ch=str(input('Do you want yo add more elements to your tree (y/n)? '))
while ch!="n":
    element=int(input("Enter the node to be inserted: "))
    tree.append(element)
    insert(r,element)
    inorder(r)
    draw_bst(tree)
    ch=str(input('Do you want yo add more elements to your tree (yes/no)? '))
ch=str(input('Do you want yo delete more elements from your tree (y/n)? '))
while ch!="n":
    element=int(input("Enter the node to be deleted: "))
    tree.remove(element)
    delete(r,element)
    inorder(r)
    draw_bst(tree)
    ch=str(input('Do you want yo delete more elements from your tree (y/n)? '))

print("\nInorder: ")
inorder(root)
