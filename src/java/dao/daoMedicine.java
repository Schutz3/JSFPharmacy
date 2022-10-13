/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Medicine;
import utility.imedUtil;

/**
 *
 * @author Farhan
 */
public class daoMedicine {
    
        public List<Medicine> getAllMedicine() {
        List listMedicine = new ArrayList();
        Transaction transaction = null;
        Session session = imedUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            Query q = session.createQuery("from Medicine");
            listMedicine = q.list();
            transaction.commit();      
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
        return listMedicine;
        }
        
        public List<Medicine> getbyID(String idMed) {
        Medicine med = new Medicine();
        List<Medicine> listMed = new ArrayList();
        Transaction transaction = null;
        Session session = imedUtil.getSessionFactory().openSession();  
        try {
            transaction = session.beginTransaction();
            Query query = session.createQuery("from Medicine where id = :id");
            query.setString("id", idMed);
            med = (Medicine) query.uniqueResult();
            listMed = query.list();
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
        return listMed;
    }
    
    // untuk add data
    public void addMed(Medicine medicine){
        Transaction transaction = null;
        Session session = imedUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(medicine);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
    }
    
    // untuk delete berdcasarkan id
    public void deleteMed(Integer idMed) {
        Transaction transaction = null;
        Session session =imedUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        try {
            String hql = "delete from Medicine where id= :mid";
            Query q = session.createQuery(hql);
            q.setInteger("mid", idMed);
            q.executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
    }
    
    // untuk edit
    public void editMed(Medicine medicine) {
        Transaction transaction = null;
        Session session = imedUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.update(medicine);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
    }
        
        
}
