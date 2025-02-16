package org.myspringapps;


import java.util.ArrayList;
import java.util.List;


public class RockMusic implements Music {
    private final List<String> songs = new ArrayList<>();

    public RockMusic() {
        songs.add("Rock_1");
        songs.add("Rock_2");
        songs.add("Rock_3");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
