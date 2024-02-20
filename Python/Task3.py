#TASK3 RANDOM PASSWORD GENERATOR

import string
import random

a=int(input("Enter the length of the password: "))
charList =""
charList+=string.ascii_letters
#print(charList)

password=[]
for i in range(a):
    randomChar = random.choice(charList)
    password.append(randomChar)

print("Your Required Password is"+"".join(password))