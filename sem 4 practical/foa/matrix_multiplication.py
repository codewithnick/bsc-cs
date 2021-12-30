import numpy as np
r=[]
m1=[]
m2=[]
r1=int(input('enter the number of rows in the matrix '))
c1=int(input('enter the number of cols in the matrix '))
print('enter ',r1*c1,' elements in matrix1 ')
for i in range(r1):
    for j in range(c1):
        r.append(int(input()))
    m1.append(r)
    r=[]
np.matrix(m1)
r2=int(input('enter the number of rows in the matrix'))
c2=int(input('enter the number of cols in the matrix'))
if(c1!=r2):
    print('this matrix cannot be multiplied')
    exit()
print('enter ',r1*c1,' elements in matrix2 ')
for i in range(r2):
    for j in range(c2):
        r.append(int(input()))
    m2.append(r)
    r=[]
np.matrix(m1)
#inputs taken
elems=r1*c2
mul=[[0 for i in range(r1)]for j in range(c2)]
print('multipliication of 2 matrix ')
for i in range(r1):
    for j in range(c2):
        suma=0
        for k in range(c1):
            
            suma+=(m1[i][k]*m2[k][j])
        mul[i][j]=suma
np.matrix(mul)
