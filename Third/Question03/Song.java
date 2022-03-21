package com.Third.Question03;

import java.util.Objects;

public class Song {
    private String movieName;
    private String songName;

    public Song(String movieName, String songName) {
        this.movieName = movieName;
        this.songName = songName;
    }

    public Song() {
    }

    public void play(){
        System.out.println( movieName+ " of " +songName  + " is playing...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(movieName, song.movieName) && Objects.equals(songName, song.songName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName, songName);
    }

    @Override
    public String toString() {
        return "Song{" +
                "movieName='" + movieName + '\'' +
                ", songName='" + songName + '\'' +
                '}';
    }
}
