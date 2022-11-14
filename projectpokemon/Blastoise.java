/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.projectpokemon;

/**
 *
 * @author acabezam
 */
public class Blastoise extends Pokemon {
    
    public Blastoise (int level) {
        super("Blastoise");
        this.level = level;
        this.type = Types.WATER;
        this.maxPower = 130;
        this.minPower = 110;
        this.power = random.nextInt(minPower, maxPower);
        this.evolveLevel = -1;
    }
    
    @Override
    public boolean hasEvolution(){
        return false;
    }
    
    @Override
    public String getEvolution(){
        return "No evolution";
    }
    
    @Override
    public Pokemon evolve(){
        return this;
    }
}
