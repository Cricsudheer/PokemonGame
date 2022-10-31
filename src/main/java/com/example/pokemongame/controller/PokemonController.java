package com.example.pokemongame.controller;

import com.example.pokemongame.repository.Pokemonrepository;
import com.example.pokemongame.service.PokemonService;
import models.GeneralResponse;
import models.Pokemon;
import models.PokemonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PokemonController {

    @Autowired
    PokemonService pokemonservice ;

    @Autowired
    Pokemonrepository pokemonrepository ;

     @GetMapping(value = "/home" , consumes = "application/json" , produces = "application/json")
     public GeneralResponse homepage(){
         GeneralResponse gResponse = new GeneralResponse();
         gResponse.setMessage("Reached Homepage");
         gResponse.setStatus(true);
         return gResponse;
     }
    @PutMapping(value = "/addPokemon" , consumes = "application/json" , produces = "application/json")
    public GeneralResponse addPokemon(@RequestBody Pokemon pokemon){

         GeneralResponse generalResponse = pokemonservice.addPokemon(pokemon);
         return generalResponse ;
    }
    @PutMapping(value = "/addPokemons" , consumes = "application/json" , produces = "application/json")
    public GeneralResponse addallPokemon(@RequestBody List<Pokemon> pokemons){
         int countOfPokemon =0;
         GeneralResponse generalResponse = new GeneralResponse();
         generalResponse.setStatus(true);
         for(Pokemon pokemon : pokemons){
             countOfPokemon+=1 ;
             pokemonrepository.save(pokemon);
         }
         generalResponse.setMessage(String.format("Added a total of %d pokemons", countOfPokemon));
         return generalResponse ;
    }

    @GetMapping(value = "/search/{pokemonName}" , consumes =  "application/json" , produces = "application/json")
    public PokemonResponse searchPokemon(@PathVariable String pokemonName){

          return pokemonservice.searchPokemon(pokemonName)  ;
    }

}
