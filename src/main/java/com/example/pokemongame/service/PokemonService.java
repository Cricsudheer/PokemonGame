package com.example.pokemongame.service;


import com.example.pokemongame.repository.Pokemonrepository;
import models.GeneralResponse;
import models.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PokemonService {
    @Autowired
    Pokemonrepository pokemonrepository ;
    public GeneralResponse addPokemon(Pokemon pokemon){
        GeneralResponse generalResponse = new GeneralResponse();
        Optional<Pokemon> currentPokemon = pokemonrepository.findById(pokemon.getId());
        if(currentPokemon.isEmpty()){
            pokemonrepository.save(pokemon);
            generalResponse.setStatus(true);
            generalResponse.setMessage("Added Successfully");
            return generalResponse ;
        }
        generalResponse.setStatus(false);
        generalResponse.setMessage("Pokemon already Exists");
        return generalResponse ;


    }
}
