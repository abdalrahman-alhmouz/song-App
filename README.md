#### Song :
* Understanding project strucutre
I have inside src/main/java/com.example.songr 4 classes,
- 1 is the SongrApplication().

* second is class Album().
- setters() and getters() for each attributes.
* consturctor public Album()\
toString().

* resources/styles.css contain the file styles.

* - resources/templates contain my html files.

* first thng i did was a update Album constructer to add id ,then i created interface class (AlbumReposity)  to connect to data base.

* secound  thing i did was a route ("/songs"), with getAllAlbum method  that will show to me  (albumsForm.html) with form to add sogn after filling the form and submit the song will be saved into database  .

* third thing i did was a new rout  (/getSong) with getAllAlbum method  that accept (Model),
and return (albumsForm.html) that will display the albums in database .

*  Navigate to localhost:port8080 to basic splash page.
Home: http://localhost:8080/.
Captialize: http://localhost:8080/capitalize/{word}.
Albums list: http://localhost:8080/albums 


 * FirstRoute :a class that contain my web application routes
 
Running the application:
