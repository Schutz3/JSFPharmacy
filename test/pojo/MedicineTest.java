/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Farhan
 */
public class MedicineTest {
    
    public MedicineTest() {
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

    /**
     * Test of getAllMedicine method, of class Medicine.
     */
    @Test
    public void testGetAllMedicine() {
        System.out.println("getAllMedicine");
        Medicine instance = new Medicine();
        List<Medicine> expResult = null;
        List<Medicine> result = instance.getAllMedicine();
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteMed method, of class Medicine.
     */
    @Test
    public void testDeleteMed() {
        System.out.println("deleteMed");
        Medicine instance = new Medicine();
        String expResult = "";
        String result = instance.deleteMed();
        assertEquals(expResult, result);
    }

    /**
     * Test of editMed method, of class Medicine.
     */
    @Test
    public void testEditMed() {
        System.out.println("editMed");
        Medicine instance = new Medicine();
        String expResult = "";
        String result = instance.editMed();
        assertEquals(expResult, result);
    }

    /**
     * Test of getById method, of class Medicine.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Medicine instance = new Medicine();
        String expResult = "";
        String result = instance.getById();
        assertEquals(expResult, result);
    }

    /**
     * Test of saveMed method, of class Medicine.
     */
    @Test
    public void testSaveMed() {
        System.out.println("saveMed");
        Medicine instance = new Medicine();
        String expResult = "";
        String result = instance.saveMed();
        assertEquals(expResult, result);
    }

    /**
     * Test of goBack method, of class Medicine.
     */
    @Test
    public void testGoBack() {
        System.out.println("goBack");
        Medicine instance = new Medicine();
        String expResult = "";
        String result = instance.goBack();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Medicine.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Medicine instance = new Medicine();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Medicine.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Medicine instance = new Medicine();
        instance.setId(id);
    }

    /**
     * Test of getName method, of class Medicine.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Medicine instance = new Medicine();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Medicine.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Medicine instance = new Medicine();
        instance.setName(name);
    }

    /**
     * Test of getType method, of class Medicine.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Medicine instance = new Medicine();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setType method, of class Medicine.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        Medicine instance = new Medicine();
        instance.setType(type);
    }

    /**
     * Test of getExpdate method, of class Medicine.
     */
    @Test
    public void testGetExpdate() {
        System.out.println("getExpdate");
        Medicine instance = new Medicine();
        Date expResult = null;
        Date result = instance.getExpdate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExpdate method, of class Medicine.
     */
    @Test
    public void testSetExpdate() {
        System.out.println("setExpdate");
        Date expdate = null;
        Medicine instance = new Medicine();
        instance.setExpdate(expdate);
    }

    /**
     * Test of getStock method, of class Medicine.
     */
    @Test
    public void testGetStock() {
        System.out.println("getStock");
        Medicine instance = new Medicine();
        int expResult = 0;
        int result = instance.getStock();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStock method, of class Medicine.
     */
    @Test
    public void testSetStock() {
        System.out.println("setStock");
        int stock = 0;
        Medicine instance = new Medicine();
        instance.setStock(stock);
    }

    /**
     * Test of getPrice method, of class Medicine.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Medicine instance = new Medicine();
        int expResult = 0;
        int result = instance.getPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrice method, of class Medicine.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        int price = 0;
        Medicine instance = new Medicine();
        instance.setPrice(price);
    }
    
}
