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
public abstract class Pokemon {
    protected String name;
    protected int power;
    protected Types type;
    protected int level;
    protected int evolveLevel;
    protected int maxPower;
    protected int minPower;
    protected Random random = new Random();
    
    public Pokemon(){}
    
    public Pokemon(String name){
        this.name = name;
    }
    
    public Pokemon(String name, int power, Types type, int level){
        this.name = name;
        this.power = power;
        this.type = type;
        this.level = level;
    }
    
    public Pokemon(Pokemon other){
        this.name = other.name;
        this.power = other.power;
        this.type = other.type;
        this.level = other.level;
    }
    
    public abstract boolean hasEvolution();
    public abstract String getEvolution();
    public abstract Pokemon evolve();
  
    public void levelUp(){
        this.level++;
        this.power+= random.nextInt(14);
    }
    
    public boolean canEvolve(){
        if (!hasEvolution()){
            return false;
        } else{
            return level >= evolveLevel;
        }
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public Types getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString(){
        String text = "Pokemon: " + this.name + "\t Type: " + this.type + "\t level: " + this.level + "\n\n";
        
        return text;
    }
}
