package com.example.pokemongame.repository;

import models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Repository
public interface Pokemonrepository extends MongoRepository<Pokemon, String> {


    List<Pokemon> findByName(String pokemonName);
}
