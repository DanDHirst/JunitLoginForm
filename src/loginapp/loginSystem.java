/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

import java.util.ArrayList;

/**
 *
 * @author dhirst1
 */
public class loginSystem {
    ArrayList<User> users = new ArrayList<>();

    public loginSystem() {
    }
    
    public boolean register(String name,String password,String username){
        User newUser = new User(name, username, password);
        if(users != null){
            for (int i = 0; i < users.size(); i++) {
                if(username.equals(users.get(i).getUsername())){
                    return false;
                }
            }  
        }
        users.add(newUser);
        return true;
        
        
    }
    
}
