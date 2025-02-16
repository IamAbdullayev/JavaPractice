package org.myspringapps;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;


public class MusicPlayer {
    private List<Music> musics;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> musics) {
        this.musics = musics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public void play() {
        System.out.println("Playing " +
                musics.get(new Random().nextInt(3))
                        .getSongs().get(new Random().nextInt(3))
        );
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("InItIaLiZe");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("DeStRoY");
    }
}
