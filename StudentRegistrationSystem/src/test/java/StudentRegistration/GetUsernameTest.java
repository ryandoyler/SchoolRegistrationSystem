/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRegistration;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 * 
 */


public class GetUsernameTest {
    
    
    
 
    @Test
    public void testGetUserName() {
            
        Date date = new Date();
        Student student1;
        student1 = new Student("Peter", 21, date , 13354296);
        String expectedUserName = "Peter21";
        String userName = student1.getUserName();
        assertEquals(userName, expectedUserName);
        
        
        
        
        
        

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
}
