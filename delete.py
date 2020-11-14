#import nessasary modules
from os import listdir, join, remove, rename
from sys import argv

#get file to be deleted
TO_DELETE = argv[1]

#Variable to hold the path to images
PATH = "images"

#Store if file was found
found = False

#Traverse through files in PATH
for img in listdir(PATH):
    #if img found remove and set found to True
    if !found:
        if img == TO_DELETE:
            os.remove(img)
            found = True

    #if found equals True rename files
    if found:
        number = int(img.split('.')[0]) - 1
        rename(img, f'{number}.jpg')
        


    

