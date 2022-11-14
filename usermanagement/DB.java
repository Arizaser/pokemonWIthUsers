/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.usermanagement;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author marizase
 */
public class DB {

    static HashMap<String, User> users = new HashMap();
    static ArrayList<Message> messages = new ArrayList();
    
    public static void addUser(User user) {
        users.put(user.getEmail(), user);
    }
    
    public static ArrayList<User> showUsers(User user) {
        ArrayList<User> returnUsers = new ArrayList();
        for (User u : users.values()) {
            if (user.getEmail() != u.getEmail()) {
                returnUsers.add(u);
                
            }
        }
        return returnUsers;
    }
    
}
