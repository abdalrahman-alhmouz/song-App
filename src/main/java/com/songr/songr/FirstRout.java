package com.songr.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FirstRout {
    @Autowired
    AlbumReposity albumReposity;

@GetMapping("/")
public String homePage(){
    return "hello.html";
}

    @GetMapping("/hello")
    public String string(@RequestParam(name="name", required=false, defaultValue="There") String name, Model m){
        m.addAttribute("name", name.toUpperCase());
        return "hello.html";
    }


    @GetMapping("/album")
    public String getAlbums(Model m){
        m.addAttribute("album",albumReposity.findAll());
        return "albums.html";
    }

    @GetMapping("/Albums/{id}")
    public ResponseEntity<Album> getAlbum(@PathVariable(value="id")Integer id ){
        Album album=albumReposity.findById(id).get();
        return new ResponseEntity(album, HttpStatus.OK);
    }



    @PostMapping("/album")
    public RedirectView addAlpum(@RequestParam(value = "title") String title,
                                 @RequestParam(value = "artist") String artist,
                                 @RequestParam(value = "imageUrl") String imageUrl,
                                 @RequestParam(value = "length") double length,
                                 @RequestParam(value = "songCount")  int songCount){
        Album album=new Album(title,artist,imageUrl,length,songCount);
        albumReposity.save(album);
        return new RedirectView("/album");}

    @GetMapping("/AlbumsForm")
    public String getAllAlbum(){
        return "albumsForm.html";

    }

}
