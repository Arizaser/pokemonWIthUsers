/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.projectpokemon;

/**
 *
 * @author acabezam
 */
public class Wartortle extends Pokemon{
    
    public Wartortle(int level){
        super("Wartortle");
        this.level = level;
        this.type = Types.WATER;
        this.maxPower = 50;
        this.minPower = 30;
        this.power = random.nextInt(minPower, maxPower);
        this.evolveLevel = 36;
    }
    
    @Override
    public boolean hasEvolution(){
        return true;
    }
    
    @Override
    public String getEvolution(){
        return "Blastoise";
    }
    
    @Override
    public Pokemon evolve(){
        return new Blastoise(level);
    }
    
    
    
    
}
