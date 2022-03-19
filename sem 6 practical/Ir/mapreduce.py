from collections import Counter
import re
test = input("Enter a String: ")
string = re.sub("[^a-zA-Z]+", "", test)
print(string)
res = Counter(string.casefold())
print ("Output " + str(res))
