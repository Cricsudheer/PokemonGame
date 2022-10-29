package com.example.pokemongame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PokemonGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokemonGameApplication.class, args);
    }

}
