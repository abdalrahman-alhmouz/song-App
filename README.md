#### Album :
 * Understanding project strucutre
I have inside src/main/java/com.example.songr 7 classes,
- 1 is the SongrApplication().

* second is class Album().
- setters() and getters() for each attributes.
* consturctor public Album()\
toString().
* update the album constructer to add an ID, 

* resources/styles.css contain the file styles.

* - resources/templates contain my html files.

* 3- is class FirstRoute().
*  reate is a route("/ addAlpum"), with the addAlpum method that will show me (albumsForm.html) with a form to add Album after filling in the form and submitting the Album it will be saved in the database.

* create a new route(/ Album) using the getAllAlbums method that accepts (form),
And return (albumsForm.html) which will display the albums in the database.

* create a new route(/ Albums/{id}) using the getAlbum method that accepts (id),
And return (the album by id ) which will display the albums by id in  the database.

 - 4- created an interface class (AlbumReposity) to connect to the database.

#### Song :
* 5- is class Song().

* create constructer to add an ID, 
* createa route("/ songs"), with the getSongs method that will show me (Songs.html) with a form to add sogn after filling in the form and submitting the song it will be saved in the database.


* createa new route(/ SongAdd) using the addSong method that accepts (form),
And return (ShowSong.html) which will display the albums in the database.

* create a new route(/Songs/{id}) using the songGeter method that accepts (id),
And return (the Song by id ) which will display the Song by id in  the database.

 - 6- created an interface class (SongReposity) to connect to the database.

*  Navigate to localhost:port8080 to basic splash page.
Home: http://localhost:8080/.
Add Albums: http://localhost:8080/AlbumsForm 
Albums list: http://localhost:8080/album 

Add Songs: http://localhost:8080/AddSongS 
Song list: http://localhost:8080/Song 


 * FirstRoute :a class that contain my web application routes
 * SongContoler :a class that contain my web application routes
 
Running the application: