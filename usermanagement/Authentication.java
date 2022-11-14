/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.usermanagement;

/**
 *
 * @author marizase
 */
public class Authentication {
    User session = null;

    public Authentication() {
    }
    
    public boolean login(String email, String password) {
        User tryUser = DB.users.get(email);
        if (tryUser != null && tryUser.getPassword().equals(password)) {
            this.session = tryUser;
            System.out.println("Se ha iniciado sesión correctamente. Bienvenido " + tryUser.getName());
            this.session = tryUser;
            return true;
        }
        System.out.println("Algún dato introducido no es correcto");
        return false;
    }
    
    public void register(String name, String email, String password) {
        User newUser = new User(name, email, password);
        DB.addUser(newUser);
        
        System.out.println("¡Se ha registrado tu usuario! Ahora inicia sesión y comprueba que se ha registrado correctamente.");
    }
    
    public void logOut() {
        this.session = null;
        System.out.println("Se ha cerrado la sesión");
    }
}
