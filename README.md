#### Album :
* The first thing I did was update the album constructer to add an ID, then I created an interface class (AlbumReposity) to connect to the database.

* The second thing I did is a route("/ addAlpum"), with the addAlpum method that will show me (albumsForm.html) with a form to add Album after filling in the form and submitting the Album it will be saved in the database.

* The third thing I did was a new route(/ Album) using the getAllAlbums method that accepts (form),
And return (albumsForm.html) which will display the albums in the database.

* The forth  thing I did was a new route(/ Albums/{id}) using the getAlbum method that accepts (id),
And return (the album by id ) which will display the albums by id in  the database.

#### Song :

* The first thing I did was update the album constructer to add an ID, then I created an interface class (SongReposity) to connect to the database.

* The second thing I did is a route("/ songs"), with the getSongs method that will show me (Songs.html) with a form to add sogn after filling in the form and submitting the song it will be saved in the database.

* The third thing I did was a new route(/ SongAdd) using the addSong method that accepts (form),
And return (ShowSong.html) which will display the albums in the database.

* The forth  thing I did was a new route(/Songs/{id}) using the songGeter method that accepts (id),
And return (the Song by id ) which will display the Song by id in  the database.

