from sklearn. feature_extraction.text import CountVectorizer
document=["Good morning to all",
"I welcome the students",
"Welcome to Bhavans College"]

# Create a Vectorizer Object
vectorizer = CountVectorizer ()
vectorizer.fit(document)

#Printing the identified Unique words along with their indices
print ("Vocabulary: ", vectorizer.vocabulary_)

#Encode the Document
vector =vectorizer.transform(document)

# Summarizing the Encoded Texts
print ("Encoded Document is:")
print (vector.toarray())


'''--------------------------------------------------------------------------------'''
print('______________________________________________________________________\n')



from sklearn. feature_extraction.text import CountVectorizer

# list of text documents

text= ["John is a good boy. John watches basketball"]
vectorizer = CountVectorizer ()

#tokenize and build vocab
vectorizer.fit (text)
print (vectorizer.vocabulary_)

#encode document.
vector =vectorizer.transform (text)

# summarize encoded vector
print (vector.shape)
print (vector.toarray())

'''--------------------------------------------------------------------------------'''
print('______________________________________________________________________\n')



import pandas as pd
coun_vect = CountVectorizer (stop_words='english')
count_matrix = coun_vect.fit_transform(text)
count_array = count_matrix.toarray()
df = pd.DataFrame(data=count_array,columns = coun_vect.get_feature_names_out())
print (df)







