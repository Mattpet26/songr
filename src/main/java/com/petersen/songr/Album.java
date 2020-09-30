package com.petersen.songr;

// 1. Annotations of Entity
// 2. Annotate and add an ID
// 3. Create a default constructor
// 4. Add jbdc url to application.properties file      -- this is like .env
// 5. Create classNameRepository interface and extend JpaRepository
// 6. Autowire this Repository
// 7. In application.properties - add spring.jpa.hibernate.ddl-auto=update

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity                                     // this can live in postgres, mysql, mongo, graphql
public class Album {

    @Id                                      //id SERIAL PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String title;
    String artist;
    int songcount;
    int length;
    String imageUrl;

    public Album(String title, String artist, int songcount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songcount = songcount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public Album(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongcount() {
        return songcount;
    }

    public void setSongcount(int songcount) {
        this.songcount = songcount;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
