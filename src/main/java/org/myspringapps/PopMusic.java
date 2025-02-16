package org.myspringapps;

import java.util.ArrayList;
import java.util.List;

public class PopMusic implements Music {
    private final List<String> songs = new ArrayList<>();

    public PopMusic() {
        songs.add("I am POP_1");
        songs.add("I am POP_2");
        songs.add("I am POP_3");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
