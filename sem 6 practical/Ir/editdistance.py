def editDistance(str1,str2,m,n):
    if m==0:
        return 0
    if n==0:
        return m
    if(str1[m-1]==str2[n-1]):
        return editDistance(str1,str2,m-1,n-1) 
    return 1+ min(editDistance(str1,str2,m,n-1),#insert
                  editDistance(str1,str2,m-1,n),#remove
                  editDistance(str1,str2,m-1,n-1))  #replace
str1="saturday"
str2="sunday"
print("the edit distance is:",editDistance(str1,str2,len(str1),len(str2))
      , "between",str1, "and",str2)
