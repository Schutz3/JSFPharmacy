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
import pojo.Staff;
import utility.imedUtil;

/**
 *
 * @author Farhan
 */
public class daoStaff {
        
        public List<Staff> getBy(String user, String pass) {
        Transaction trans = null;
        Staff stf = new Staff();
        List<Staff> usr = new ArrayList();
        Session session = imedUtil.getSessionFactory().openSession();
        
        try {
            trans = session.beginTransaction();
            Query q = session.createQuery("from Staff where username =:uSername AND password=:uPass");
            q.setString("uSername", user);
            q.setString("uPass", pass);
            stf = (Staff) q.uniqueResult();
            usr = q.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
        return usr;
    }
        
    public void regstaff(Staff staff){
        Transaction trans = null;
        Session session = imedUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            session.save(staff);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
    }
    
    public List<Staff> getByUsrID(String user, int ids) {
        Transaction trans = null;
        Staff stf = new Staff();
        List<Staff> usr = new ArrayList();
        Session session = imedUtil.getSessionFactory().openSession();
        
        try {
            trans = session.beginTransaction();
            Query q = session.createQuery("from Staff where username =:uSername AND id= :uId");
            q.setString("uSername", user);
            q.setInteger("uId", ids);
            stf = (Staff) q.uniqueResult();
            usr = q.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
        return usr;
    }
    
    public void editStf(String pw, int id) {
        Transaction transaction = null;
        Session session = imedUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        try {
            Query q = session.createQuery("update Staff set password=:pw where id=:sid");
            q.setString("pw", pw);
            q.setInteger("sid", id);
            q.executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
    }
}
