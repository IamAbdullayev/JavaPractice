package org.myspringapps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    Random random = new Random();

    public void play(MusicGenre genre) {
        switch (genre) {
            case ROCK -> System.out.println("Playing " + music1.getSongs().get(random.nextInt(3)));
            case CLASSICAL -> System.out.println("Playing " + music2.getSongs().get(random.nextInt(3)));
        }
    }
}
