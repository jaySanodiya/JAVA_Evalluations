package com.Third.Question03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayList {
    public List<Song> songs = new ArrayList<>();

    public void addSong(Song song){
        Song sc = new Song();
        for (Song s:songs) {
            if(song.equals(s)){
                System.out.println("Song is already added in the playlist");
                return;
            }
        }
        songs.add(song);

        System.out.println("Song added to the playlist successfully.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PlayList pl = new PlayList();
        System.out.println("Enter sons details");
        int count =0;
        while(count<5){
            count++;
            System.out.println("Enter Song name");
            String songName = sc.next();

            System.out.println("Enter Movie name");
            String movieName = sc.next();

            Song song = new Song(songName,movieName);
            pl.addSong(song);
        }

        for (Song son:pl.songs) {

            son.play();
        }
    }
}
