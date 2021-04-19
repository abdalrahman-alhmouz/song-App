#### Song :
* The first thing I did was update the album constructer to add an ID, then I created an interface class (AlbumReposity) to connect to the database.

* The second thing I did is a route("/ songs"), with the getAllAlbum method that will show me (albumsForm.html) with a form to add sogn after filling in the form and submitting the song it will be saved in the database.

* The third thing I did was a new route(/ getSong) using the getAllAlbum method that accepts (form),
And return (albumsForm.html) which will display the albums in the database.
