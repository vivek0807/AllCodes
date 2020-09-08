line=input("Enter the sentence:")
word=input("Enter the word to remove :")
wordlist=list(line.split(" "))
finalString=""
for w in wordlist:
    if w!=word:
        finalString=finalString+w+" "
print(finalString)
