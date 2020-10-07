package com.petersen.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class AlbumController {

    @Autowired // connecting to and creating necessary stuff in the db
    public AlbumRepository albumRepository;

    @PostMapping("/albums/delete/{id}")
    public RedirectView deleteAlbum(@PathVariable long id){
        albumRepository.deleteById(id);
        return new RedirectView("/albums");
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(String title, String artist, int songcount, int length, String imageUrl){
        Album newAlb = new Album(
                title,
                artist,
                songcount,
                length,
                imageUrl
        );
        albumRepository.save(newAlb);

        return new RedirectView("/albums");
    }

    @GetMapping("/albums")
    public String showAlbum(Model mPotato){
        ArrayList<Album> songs = (ArrayList<Album>) albumRepository.findAll();
        mPotato.addAttribute("album", songs);
        return "album";
    }

    @GetMapping("/singlealbum")
    public String showSingleAlbum(Model mPotato, long albumId) {
        Album album = albumRepository.getOne(albumId);
        System.out.println(albumId + "logged here");
        System.out.println(album.getId());
        mPotato.addAttribute("album", album);
        return "singlealbum";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
