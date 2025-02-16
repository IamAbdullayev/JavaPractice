package org.myspringapps;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("org.myspringapps")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public Music popMusic() {
        return new PopMusic();
    }
    @Bean
    public Music rockMusic() {
        return new RockMusic();
    }
    @Bean
    public Music classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(popMusic(), classicalMusic(), rockMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }
}
