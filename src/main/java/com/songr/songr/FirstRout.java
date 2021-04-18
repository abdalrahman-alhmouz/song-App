package com.songr.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class FirstRout {
    @GetMapping("/")
    @ResponseBody
    public String homePage(){
        return "helloTest";
    }

    @GetMapping("/hello")
    public String showHello(){
        return "hello.html";
    }

    @GetMapping("/capitalize/{world}")
    public String capitalize(Model  m, @PathVariable("world") String world){
        m.addAttribute("world",world);
        return "uperCase.html";

    }

    @GetMapping("/albums")
    public String albums(Model  m){
        ArrayList<Album> albums=new ArrayList<>();
        Album album=new Album("Hello","Adele","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3_tgt-9eSrg_VBIqN1mmLl5lJ2f_a5fmi91t4gMvN3YV1QJ2FJou2QJ1-Q5-xHq1blgw&usqp=CAU",6.6,0);
        Album albumOne=new Album("Diamonds","Rihanna ","https://i.ytimg.com/vi/EemxFDFpFTU/maxresdefault.jpg",4.42,1);
        Album albumTow=new Album("Whenever","Shakira ","https://i.ytimg.com/vi/weRHyjj34ZE/maxresdefault.jpg",3.17,2);
        albums.add(album);
        albums.add(albumOne);
        albums.add(albumTow);
        m.addAttribute("albums",albums);
        return "albums.html";

    }
}
