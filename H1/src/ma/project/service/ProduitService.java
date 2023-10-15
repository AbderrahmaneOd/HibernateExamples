/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.service;

import ma.project.dao.IDao;
import ma.project.util.HibernateUtil;
import ma.project.entity.Produit;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hp
 */
public class ProduitService implements IDao<Produit> {

    @Override
    public boolean create(Produit p) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(p);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public boolean delete(Produit p) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.delete(p);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public boolean update(Produit p) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.update(p);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<Produit> findAll() {
        List<Produit> products = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            products = session.createQuery("from Produit").list();
            tx.commit();
            return products;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return products;
        } finally {
            if(session != null)
                session.close();
        }
    }

    @Override
    public Produit findById(int id) {
        Produit produit = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            produit = (Produit) session.get(Produit.class, id);
            tx.commit();
            return produit;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return produit;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    
    @Override
    public List<Produit> getProduitsPrixSuperieur(double prix){
        List<Produit> products = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            String hql = "FROM Produit p WHERE p.prix > :prixLimite";
            Query query = session.createQuery(hql);
            query.setParameter("prixLimite", prix);
            products = query.list();
            return products;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return products;
        } finally {
            if(session != null)
                session.close();
        }
    }
}
