# Songr

## What is Songr about?
### The app is able to capitalize words and allow the user to create albums!
## The app also allows the user to add/view songs within an album

##Routes
1. /hello: This takes the user to the hello world route
2. /capitalize/message-here: This route capitalizes the users message entered in the route
3. /albums: Allows the user to create new albums that display to the user
4. /singlealbum: Allows the user to view information about a single album.
5. /song: The user can go to song to look at all the songs within an album!

## How to Run the File
Clone the git repo into the terminal using the command   
```
git clone https://github.com/mattpet26/songer.com
```
- Open IntelliJ using the correct folder 

- To start the server and get everything running go to src/main/java/com.petersen/SongrApplication and hit play or build!

- Now go to the web-page to view the pages
```
localhost:8080/capitalize/words-to-capitalize || localhost:8080/ (home page)
```
- Users can also view/add/remove albums by the following:
```
localhost:8080/albums 
```
- The albums page will redirect users to /songs, where the user can then add or remove songs for EACH album
```
localhost:8080/songs
```

## Tests Done
Tests call all be found wtihin src/test/java/com.petersen.songr/tests