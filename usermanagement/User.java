/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.usermanagement;

import com.curso.projectpokemon.Trainer;

/**
 *
 * @author marizase
 */
public class User {
    private String name;
    private String password;
    private String email;
    private Trainer trainer;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.trainer = new Trainer();
    }

    public Trainer getTrainer() {
        return trainer;
    }
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
    
    public boolean checkCurrentPassword(String password) {
        return password.equals(this.password);
    }
    
    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Se ha cambiado su contraseña correctamente.");
    }
    
    public void changeEmail(String newEmail) {
        this.email = newEmail;
        System.out.println("Se ha cambiado su email.");
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", password=" + password + ", email=" + email + '}';
    }
}
