package org.myspringapps;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class MusicGenres {
    private List<Music> musics = new ArrayList<>();

    public MusicGenres(Music pop, Music rock, Music classical) {
        musics.add(pop);
        musics.add(rock);
        musics.add(classical);
    }

    public List<Music> getMusics() {
        return musics;
    }
}
