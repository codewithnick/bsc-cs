import nltk
nltk.download ('stopwords')
nltk.download ('punkt')
from nltk.corpus import stopwords
from nltk.tokenize import word_tokenize
file=open(r"C:\Users\nikhi\OneDrive\Documents\sem 6 practicals\Ir\message.txt",'r')
sent=file.read()
stop=set (stopwords.words ('english'))
token=word_tokenize (sent)
a=[]
for w in token:
    if w not in stop:
           a.append (w)
print("Original sentence : ", token)
print("="*45)
print ("Stop words: ",stop)
print("="*45)
print ("Stop words removal : ",a)
print(" ".join(a))
