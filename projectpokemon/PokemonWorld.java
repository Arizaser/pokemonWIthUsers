/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.projectpokemon;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author acabezam
 */
public class PokemonWorld {
    private ArrayList<Pokemon> pokemons = new ArrayList<>();
    private Random random = new Random();
    
    public PokemonWorld(){
        Pokemon squirtle = new Squirtle(random.nextInt(1,101));
        Pokemon wartortle = new Wartortle(random.nextInt(1,101));
        Pokemon blastoise = new Blastoise(random.nextInt(1,101));
        Pokemon charmander = new Charmander(random.nextInt(1,101));
        Pokemon charmeleon = new Charmeleon(random.nextInt(1,101));
        Pokemon charizard = new Charizard(random.nextInt(1,101));
        Pokemon bulbasaur = new Bulbasaur(random.nextInt(1,101));
        Pokemon ivysaur = new Ivysaur(random.nextInt(1,101));
        Pokemon venosaur = new Venosaur(random.nextInt(1,101));
        
        pokemons.add(squirtle);
        pokemons.add(wartortle);
        pokemons.add(blastoise);
        pokemons.add(charmander);
        pokemons.add(charmeleon);
        pokemons.add(charizard);
        pokemons.add(bulbasaur);
        pokemons.add(ivysaur);
        pokemons.add(venosaur);
    }
    
    public Pokemon getRandomPokemon(){
        int randomIndex = random.nextInt(pokemons.size());

        return pokemons.get(randomIndex);
    }
}
