import sys


file = open ('E:\\Users\\GerardoS\\Dropbox\\CodeEval Challenges\\lowercaseText\\input.txt', 'r')

print ("This program will take an input file and make it uppercase, then lowercase \n Input File:\n")

for line in file:
    print(line)

print ("Upper Case:\n")
for line1 in file:
    x = line1.upper()
    print (x)
    
print ("Lowercase:\n")
for line2 in file:
    x = line2.lower()
    print(x)
