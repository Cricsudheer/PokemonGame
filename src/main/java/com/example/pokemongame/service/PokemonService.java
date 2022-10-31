package com.example.pokemongame.service;


import com.example.pokemongame.repository.Pokemonrepository;
import models.GeneralResponse;
import models.Pokemon;
import models.PokemonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PokemonService {
    @Autowired
    Pokemonrepository pokemonrepository ;

    @Autowired
    GeneralService generalService ;
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

    public PokemonResponse searchPokemon(String pokemonName){

        pokemonName = generalService.formattedString(pokemonName);

        PokemonResponse pokemonResponse = new PokemonResponse();
        pokemonResponse.setPokemonList(pokemonrepository.findByName(pokemonName));
        pokemonResponse.setMessage(String.format("Found a total of %d pokemons", pokemonResponse.getPokemonList().size()));
        return pokemonResponse;


    }
}
