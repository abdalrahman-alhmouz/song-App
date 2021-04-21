package com.songr.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongControler {
    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumReposity albumReposity ;

    @GetMapping("/Song")
    public String getSongs(Model m){
        m.addAttribute("songs",songRepository.findAll());
        return "ShowSong.html";
    }

    @GetMapping("/Songs/{id}")
    public ResponseEntity<Song> songGeter(@PathVariable(value="id")Integer id ){
        Song song=songRepository.findById(id).get();
        return new ResponseEntity(song, HttpStatus.OK);
    }



    @PostMapping("/SongAdd")
    public RedirectView addSong(String title, int length, int trackNumber, Integer id){
        Album album=albumReposity.findById(id).get();
        Song song=new Song( title,  length, trackNumber,album);
        songRepository.save(song);
        return new RedirectView("/Song");
    }
        @GetMapping("/Songs.html")
    public String getPage(){
        return "Songs.html";
    }

}