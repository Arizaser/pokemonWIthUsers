/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.curso.usermanagement;

import com.curso.projectpokemon.Trainer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marizase
 */
public class Main {

    public static void showMenuLogOut() {
        System.out.println("---------------------------");
        System.out.println("""
                           QUÉ QUIERES REALIZAR EN EL SISTEMA
                           | 1. Iniciar sesión
                           | 2. Registrarse
                           | 0. CERRAR PROGRAMA """);
        System.out.println("---------------------------");
    }
    
    public static void showMenuLogIn() {
        System.out.println("---------------------------");
        System.out.println("""
                           Estás con la sesión iniciada
                           | 1. Modificar email
                           | 2. Modificar contraseña
                           | 3. Jugar pokemón
                           | 4. Cerrar sesión
                           | 0. CERRAR PROGRAMA """);
        System.out.println("---------------------------");
    }
    
    public static boolean isCorrectIndex(Trainer trainer, int index) {
        return index <= trainer.getPokemonTeamSize() && index > 0;
    }
    
    public static void pokemonMenu(User user) {
        int accion = -1;
        Scanner sc = new Scanner(System.in);
        int numPokemon;
        int indexFight;
        
        while (accion != 9){
            System.out.println("Welcome to Pokemitos!");
            
            System.out.println("Press:\n 1: To see your pokemon team \t "
                    + "2: Battle \t 3: Train \t 4: Capture a new pokemon \t 5: Fight another trainer \t 9: Exit");
            
            accion = sc.nextInt();
            
            switch(accion){
                case 1:
                    System.out.println(user.getTrainer().showPokemonTeam());
                    break;
                case 2:
                    numPokemon = -1;
                    
                    while (numPokemon == -1 || !isCorrectIndex(user.getTrainer(), numPokemon)){
                        System.out.println(user.getTrainer().showPokemonTeam());
                        
                        System.out.println("Choose the pokemon who is going to battle");
                        numPokemon = sc.nextInt();
                    }
                    
                    System.out.println(user.getTrainer().battle(numPokemon-1));
                    break;
                case 3:
                    numPokemon = -1;
                    
                    while (numPokemon == -1 || !isCorrectIndex(user.getTrainer(), numPokemon)){
                        System.out.println(user.getTrainer().showPokemonTeam());
                        
                        System.out.println("Choose the pokemon you want to train");
                        numPokemon = sc.nextInt();
                    }
                    
                    System.out.println(user.getTrainer().train(numPokemon-1));
                    break;
                case 4:
                    System.out.println(user.getTrainer().capture());
                    break;
                case 5:
                    ArrayList<User> listUsers = DB.showUsers(user);
                    System.out.println("Choose your fight: ");
                    for (User u : listUsers) {
                        System.out.println(u.getName() + "\n" + u.getTrainer().showPokemonTeam());
                    }
                    indexFight = sc.nextInt();
                    
                    numPokemon = -1;
                    
                    while (numPokemon == -1 || !isCorrectIndex(user.getTrainer(), numPokemon)){
                        System.out.println(user.getTrainer().showPokemonTeam());
                        
                        System.out.println("Choose the pokemon you want to fight with");
                        numPokemon = sc.nextInt();
                    }
                    
                    System.out.println(user.getTrainer().fightUser(listUsers.get(indexFight), numPokemon-1));
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Please introduce a correct number");
                    
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Authentication auth = new Authentication();

        int selectOption;
        String selectLine1;
        String selectLine2;
        String selectLine3;
        do {
            if (auth.session == null) {
                showMenuLogOut();
                selectOption = Integer.parseInt(sc.nextLine());
                switch (selectOption) {
                    case 1 -> {
                        System.out.println("Introduce tu email");
                        selectLine1 = sc.nextLine();
                        System.out.println("Introduce tu contraseña");
                        selectLine2 = sc.nextLine();
                        auth.login(selectLine1, selectLine2);
                        break;
                    }
                    case 2 -> {
                        System.out.println("REGISTRO\nIntroduce tu nombre");
                        selectLine1 = sc.nextLine();
                        System.out.println("Introduce tu email");
                        selectLine2 = sc.nextLine();
                        System.out.println("Introduce tu contraseña");
                        selectLine3 = sc.nextLine();
                        auth.register(selectLine1, selectLine2, selectLine3);
                        break;
                    }
                }
            } else {
                showMenuLogIn();
                selectOption = Integer.parseInt(sc.nextLine());
                switch (selectOption) {
                    case 1 -> {
                        System.out.println("CAMBIAR EMAIL\nIntroduce tu contraseña para comprobar que eres tú");
                        selectLine1 = sc.nextLine();
                        if (auth.session.checkCurrentPassword(selectLine1)) {
                            System.out.println("Introduce tu nuevo email");
                            selectLine1 = sc.nextLine();
                            auth.session.changePassword(selectLine1);
                        } else {
                            System.out.println("La contraseña introducida no es correcta");
                        }
                        break;
                    }
                    case 2 -> {
                        System.out.println("CAMBIAR CONTRASEÑA\nIntroduce tu actual contraseña");
                        selectLine1 = sc.nextLine();
                        if (auth.session.checkCurrentPassword(selectLine1)) {
                            System.out.println("Introduce tu contraseña nueva");
                            selectLine1 = sc.nextLine();
                            auth.session.changePassword(selectLine1);
                        } else {
                            System.out.println("La contraseña introducida no es correcta");
                        }
                        break;
                    }
                    case 3 -> {
                        pokemonMenu(auth.session);
                        break;
                    }
                    case 4 -> {
                        auth.logOut();
                    }
                }
            }

        } while (selectOption != 0);
        System.out.println(DB.users);
    }
}
