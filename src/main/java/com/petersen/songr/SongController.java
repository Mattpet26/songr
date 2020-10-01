package com.petersen.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/song")
    public String songAlbum(Model mPotato) {
        ArrayList<Song> songs = (ArrayList<Song>) songRepository.findAll();
        mPotato.addAttribute("potatoes", songs);
        return "song";
    }

    @PostMapping("/song")
    public RedirectView addSong(long albumId){
        Album al = albumRepository.getOne(albumId);
        Song songs = new Song(al, "Beatbois", 4, 1);
        songRepository.save(songs);

        return new RedirectView("/song");
    }
}
