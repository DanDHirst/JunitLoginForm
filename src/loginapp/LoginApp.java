/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

/**
 *
 * @author dhirst1
 */
public class LoginApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        loginSystem system = new loginSystem();
        system.register("dan", "123", "dan");
        System.out.println(system.users.get(0).getName());
    }
    
}
