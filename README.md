# Songr

## What is Songr about?
### The app is able to capitalize words and display bands to a user

## How to Run the File
1. Clone the git repo into the terminal using the command   
```
git clone https://github.com/mattpet26/songer.com
```

2. cd into songr directory  
``` 
cd songr 
```
3. To start the server and get everything running hit the build button or 
```
./gradlew run
```
4. Now go to the web-page
```
localhost:8080/capitalize/wordstocapitalize || localhost:8080/album
```
6. To run tests, check try
```
./gradlew test
```

## Methods Used In The App Call
1. __printQuote(String filePath)__:    Method that takes in String filepath and then returns random quotes with author names

2. __printQuotes(String filePath, String author)__:  
Method that takes in String file path to json file and name of author and returns quotes by the author  

3. __starWarsQuote(String url)__:  
Method that takes in a String url and returns a String with a random quote from a Star Wars API.  It also caches the quote in a file in resources folder so that if the url access is not available, it can print a random cached quotes.  

4. __getRecentQuotes(String filePath)__:  
Method that takes in String file path to a json file and returns an array of Quote objects from the file.  

5. __writeRecentQuotes(String filePath, arrayList quoteObjects)__:  
Method that takes in a String File path and ArrayList of Quotes and converts them into json and saves them into a .json file in the path.



## Tests Done
Tests available for App file and Quote file  