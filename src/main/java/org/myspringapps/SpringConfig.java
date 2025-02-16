package org.myspringapps;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.myspringapps")
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
    public MusicGenres musicGenres() {
        return  new MusicGenres(popMusic(), rockMusic(), classicalMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicGenres());
    }
}
