package org.myspringapps;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private final List<String> songs = new ArrayList<>();

    public ClassicalMusic() {
        songs.add("Classical_1");
        songs.add("Classical_2");
        songs.add("Classical_3");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
