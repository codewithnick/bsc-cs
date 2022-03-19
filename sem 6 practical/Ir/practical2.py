import numpy as np
from fractions import Fraction

def display_format (my_vector, my_decimal):
    return np.round ( (my_vector).astype (float), decimals=my_decimal)
dp= Fraction (1,3)
M= np.matrix ([[0, Fraction (1,2), Fraction(1,2)],
[1, 0, 0],
[1, 0, 0]]
)
print (M)

E = np.zeros((3,3))
E[:] = dp
beta=0.9

A = beta * M + ((1-beta)* E)
r = np.matrix ([dp, dp, dp])
r = np. transpose (r)
previous_r= r

for i in range (1,10):
    r = A * r
    print (r)
    print (display_format(r, 3))
    if (previous_r==r).all():
        break
previous_r = r

print ("Final: \n", display_format(r, 3))
print ("sum", np.sum (r))
