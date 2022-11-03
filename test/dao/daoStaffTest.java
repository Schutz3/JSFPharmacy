/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Staff;

/**
 *
 * @author ASUS
 */
public class daoStaffTest {
    
    public daoStaffTest() {
    }
    
    @Before
    public void setUpClass() {
    System.out.println("***** Start Testing *****");
  }
    
    @After
    public void tearDownClass() {
    System.out.println("***** End Testing *****");
  }
    
    @Before
  public void setUp() {
    
  }
  
  @After
  public void tearDown() {
    
  }

    /**
     * Test of getBy method, of class daoStaff.
     */
    @Test
    public void testGetBy() {
        System.out.println("Login test");
        String uEmail = "iman";
        String uPass = "iman";
        int empty = 0;
        daoStaff instance = new daoStaff();
        List<Staff> result = instance.getBy(uEmail, uPass);
        System.out.println(result.toArray().length);
        assertThat(result.toArray().length, is(not(equalTo(empty))));
        
    }

    /**
     * Test of regstaff method, of class daoStaff.
     */
    @Test
    public void testRegstaff() {
         System.out.println("Test Register");
    
    Staff staff = new Staff();
    staff.setUsername("adji");
    staff.setPassword("123");
    
    daoStaff instance = new daoStaff();
    instance.regstaff(staff);
    assertNotNull(staff);
  }
}


    

