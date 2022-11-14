/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.projectpokemon;

/**
 *
 * @author acabezam
 */
public class Squirtle extends Pokemon{
    
    public Squirtle(int level){
        super("Squirtle");
        this.level = level;
        this.type = Types.WATER;
        this.maxPower = 30;
        this.minPower = 10;
        this.power = random.nextInt(minPower, maxPower);
        this.evolveLevel = 16;
    }
    
    @Override
    public String getEvolution(){
        return "Wartortle";
    }
    
    @Override
    public boolean hasEvolution(){
        return true;
    }
    
    @Override
    public Pokemon evolve(){
        return new Wartortle(level);
    }
}
