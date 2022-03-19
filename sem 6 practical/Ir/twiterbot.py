
import tweepy
consumer_key="vpxW7hxyer3AJJuAfo1PVIkWk"
consumer_secret="oRgej1MsGPx8nuLmfYMFCiR2tIpXmggjW2n4Rs9r7MJwOraIiQ"
access_token="1351248261403664384-eItGUIrp0m0iBhXrhIZPj8ghLVRwut"
access_token_secret= "XPkovcRJlRpIS3x6kJhiFxZytUkxH2N0mn4EFlL5Xyfm6"
client_id="UnBUQmptSzEzd3E4c2Jlb3owZ3k6MTpjaQ"
client_secret="uFxb2VtE0oySBgZgu2014O4scT41YaUUmLlha14KZVjUM-hb42"

#Creating the authentication object
auth=tweepy.OAuthHandler (consumer_key, consumer_secret)
#setting your acces token and secret
auth.set_access_token (access_token, access_token_secret)
# Create API object
api = tweepy.API(auth)
#api object you create then you take the name of the user and tweet count name= "paulocoelho"
# Number of tweets to pull
name="paulocoelho"
tweetCount =10
#calling the user_timeline function with our parameters
results=api.user_timeline (id=name, count=tweetCount)
#for each through all tweets pulled

for tweet in results:
#printing the text stored inside the tweet object
    print (tweet.text)
