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
                67,
                12,
                "https://en.wikipedia.org/wiki/Athlete_(band)#/media/File:AthleteBandApril2008.jpg"
        ));
        songs.add(new Album("Doggos",
                "woofmanJ",
                1,
                60,
                "http://Barkbois.com"
        ));
        songs.add(new Album(
                "Feeling blue",
                "Jman",
                15,
                9,
                "http://Sadbois.com"
        ));
        mPotato.addAttribute("album", songs);
        return "album";
    }
}
