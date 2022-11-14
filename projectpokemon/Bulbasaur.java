/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.projectpokemon;

/**
 *
 * @author acabezam
 */
public class Bulbasaur extends Pokemon{
    
    public Bulbasaur(int level){
        super("Bulbasaur");
        this.level = level;
        this.maxPower = 30;
        this.minPower = 10;
        this.power = random.nextInt(minPower, maxPower);
        this.type = Types.GRASS;
        this.evolveLevel = 16;
    }
    
    @Override
    public String getEvolution(){
        return "Ivysaur";
    }
    
    @Override
    public boolean hasEvolution(){
        return true;
    }
    
    @Override
    public Pokemon evolve(){
        return new Ivysaur(level);
    }  
}
