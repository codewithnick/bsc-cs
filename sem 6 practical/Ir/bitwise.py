import pandas as pd
from sklearn.feature_extraction.text import CountVectorizer

docs=['why hello hello there','omg hello pony','she went there? omg']
print(docs)
vec=CountVectorizer()
x=vec.fit_transform(docs)
print('vocabulary',vec.vocabulary_)
print(x)
df=pd.DataFrame(x.toarray(),columns=vec.get_feature_names())
print(df)
w1=input("enter word1: ")
w2=input("enter word1: ")
op=input("enter operator: ")
x=[]
print("shape",df.shape[0])
for i in range(df.shape[0]):
    if(op=="&"):
        a=(list(df.loc[:,w1]))[i]&(list(df.loc[:,w2]))[i]
        x.append(a)
    if(op=="|"):
        a=(list(df.loc[:,w1]))[i]|(list(df.loc[:,w2]))[i]
        x.append(a)
print(x)
for i in range(df.shape[0]):
    if(x[i]):
        print("Doc",i)
