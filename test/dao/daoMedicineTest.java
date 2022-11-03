/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.GregorianCalendar;
import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Medicine;
import utility.imedUtil;

/**
 *
 * @author ASUS
 */
public class daoMedicineTest {
    
    public daoMedicineTest() {
    }
    
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

    /**
     * Test of getAllMedicine method, of class daoMedicine.
     */
    @Test
    public void testGetAllMedicine() {
    System.out.println("Test List Medicine");
    daoMedicine instance = new daoMedicine();
    List<Medicine> result = instance.getAllMedicine();
    System.out.println("Total Medicine: " + result.toArray().length);
    assertFalse(result.isEmpty());
  }

    /**
     * Test of getbyID method, of class daoMedicine.
     */
    @Test
    public void testGetbyID() {
        System.out.println("Test Search by ID");
      String idMed = "1";
      daoMedicine instance = new daoMedicine();
      List<Medicine> result = instance.getbyID(idMed);
      System.out.println(result.toArray().length);
        assertThat(result.toArray().length, is(not(equalTo(idMed))));
  }

    /**
     * Test of addMed method, of class daoMedicine.
     */
    @Test
    public void testAddMed() {
       System.out.println("Test Create Product");
    
    Medicine medicine = new Medicine();
    medicine.setName("paracetamol");
    medicine.setType("Green_Labled");
    medicine.setExpdate(new GregorianCalendar(2024, 11, 29).getTime());
    medicine.setPrice(10000);
    medicine.setStock(123);
    
    daoMedicine instance = new daoMedicine();
    instance.addMed(medicine);
    assertNotNull(medicine);
  }

    /**
     * Test of deleteMed method, of class daoMedicine.
     */
    @Test
    public void testDeleteMed() {
    System.out.println("Test Delete Medicine");
    
    Integer idProduct = 12;
    daoMedicine instance = new daoMedicine(); 
    Transaction transaction = null;
    Session session =imedUtil.getSessionFactory().openSession();
    
    transaction = session.beginTransaction();
    instance.deleteMed(idProduct);
    transaction.commit();
    
    Medicine deletedMedicine = (Medicine) session.get(Medicine.class, idProduct);
    assertNull(deletedMedicine);
  }

    /**
     * Test of editMed method, of class daoMedicine.
     */
    @Test
    public void testEditMed() {
      System.out.println("Test Edit Medicine");
    
    daoMedicine instance = new daoMedicine();
    Transaction transaction = null;
    Session session = imedUtil.getSessionFactory().openSession();
    
    Integer id = 11;
    Medicine medicine= new Medicine();
    medicine.setId(id);
    medicine.setName("paracetamol");
    medicine.setType("Green_Labled");
    medicine.setExpdate(new GregorianCalendar(2024, 11, 29).getTime());
    medicine.setPrice(10000);
    medicine.setStock(123);
    
    transaction = session.beginTransaction();
    instance.editMed(medicine);
    transaction.commit();
    
    Medicine updatedMedicine = (Medicine) session.get(Medicine.class, id);
    
    String expResult = "paracetamol";
    String result = updatedMedicine.getName();
    System.out.println(expResult);
    System.out.println(result);
    assertEquals(expResult, result);
  }
  
}
