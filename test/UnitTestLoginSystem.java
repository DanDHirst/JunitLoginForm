/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import loginapp.User;
import loginapp.loginSystem;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author dhirst1
 */
public class UnitTestLoginSystem {
    
    public UnitTestLoginSystem() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    public void register(){
        loginSystem system = new loginSystem();
        system.register("dan", "123", "dan");
        ArrayList<User> user = system.getUsers();
        

        assertEquals("check the name", "dan",user.get(0).getName());
        assertEquals("check the password", "123",user.get(0).getPassword());
        assertEquals("check the username", "dan",user.get(0).getUsername());
        
    }
    
    public void login(){
        
    }
}
