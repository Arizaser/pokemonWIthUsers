/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.projectpokemon;

import java.util.Random;

/**
 *
 * @author acabezam
 */
public class Charizard extends Pokemon{
    
    public Charizard(int level){
        this.name = "Charizard";
        this.level = level;
        this.type = Types.FIRE;
        this.maxPower = 150;
        this.minPower = 120;
        this.power = random.nextInt(minPower, maxPower);
        this.evolveLevel = -1;
    }
    
    public Charizard(){
        this.name = "Charizard";
        this.level = 36;
        this.type = Types.FIRE;
        this.power = random.nextInt(minPower, maxPower);
        this.evolveLevel = -1;
    }
    
    @Override
    public String getEvolution(){
        return "No evolution";
    }
    
    @Override
    public boolean hasEvolution(){
        return false;
    }
    
    @Override
    public Pokemon evolve(){
        return this;
    }
}
