/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.projectpokemon;

/**
 *
 * @author acabezam
 */
public class Venosaur extends Pokemon{
    public Venosaur(int level){
        super("Venosaur");
        this.level = level;
        this.type = Types.GRASS;
        this.maxPower = 150;
        this.minPower = 120;
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
