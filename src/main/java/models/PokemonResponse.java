package models;

import jdk.jfr.DataAmount;

import java.util.List;
import java.util.Optional;

public class PokemonResponse {
        String message ;
        List<Pokemon> pokemonList ;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }
}
