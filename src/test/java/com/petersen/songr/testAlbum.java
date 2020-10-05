package com.petersen.songr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertTrue;

public class testAlbum {
    @Test
    public void testConstructor() {
        Album album = new Album("New guys", "solo boi", 5, 10, "http://doujie.com");

        assertEquals("New guys", album.getTitle());
        assertEquals("solo boi", album.getArtist());
        assertEquals(5, album.getSongcount());
        assertEquals(10, album.getLength());
        assertEquals("http://doujie.com", album.getImageUrl());
    }
    @Test
    public void testSongConstructor(){
        Album album = new Album("New guys", "solo boi", 5, 10, "http://doujie.com");
        Song song = new Song(album, "hotnewSong", 4, 3);

        assertEquals("hotnewSong", song.getTitle());
        assertEquals("New guys", song.album.getTitle());
        assertEquals(4, song.getLength());
        assertEquals(3, song.getTrackNumber());
    }
}
