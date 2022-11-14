/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.projectpokemon;

/**
 *
 * @author acabezam
 */
public class Ivysaur extends Pokemon{
    
    public Ivysaur(int level){
        super("Ivysaur");
        this.level = level;
        this.maxPower = 50;
        this.minPower = 30;
        this.type = Types.GRASS;
        this.evolveLevel = 36;
    }
    
    @Override
    public String getEvolution(){
        return "Venosaur";
    }
    
    @Override
    public boolean hasEvolution(){
        return true;
    }
    
    @Override
    public Pokemon evolve(){
        return new Venosaur(this.level);
    }
}
