package com.petersen.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class AlbumController {
    @GetMapping("/album")
    public String actualAlbum(Model mPotato){
        ArrayList<Album> songs = new ArrayList<>();
        songs.add(new Album(
                "Beebbops",
                "the bots",
                679,
                12,
                "http://thebotsrock.com"
        ));
        songs.add(new Album("Doggos",
                "woofmanJ",
                1,
                6000,
                "Http://Barkbois.com"
        ));
        songs.add(new Album(
                "Feeling blue",
                "J J Jman",
                15,
                9,
                "Http://Sadbois.com"
        ));
        mPotato.addAttribute("album", songs);
        return "album";
    }
}
