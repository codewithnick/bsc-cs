
import requests
from bs4 import BeautifulSoup
plain_text=requests.get('https://codewithnick.github.io/').text
s=BeautifulSoup(plain_text,"html.parser")
for link in s.findAll('img'):
    tet=link.getText()
    print(tet)
    print(link)
print(plain_text)
print("") 
print(s.text)
print(s.status_code)
