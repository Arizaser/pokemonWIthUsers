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
public class Charmeleon extends Pokemon{  
    public Charmeleon(int level){
        super("Charmeleon");
        this.maxPower = 50;
        this.minPower = 30;
        this.power = random.nextInt(minPower, maxPower);
        this.type = Types.FIRE;
        this.level = level;
        this.evolveLevel = 36;
    }
    
    @Override
    public String getEvolution(){
        return "Charizard";
    }
    
    @Override
    public boolean hasEvolution(){
        return true;
    }
    
    @Override
    public Pokemon evolve(){
        return new Charizard(level);
    }
}
