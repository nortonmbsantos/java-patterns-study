package com.norton.patterns_project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.norton.patterns_project.coffee.Coffee;

public class CoffeeDao {
	private Session currentSession;
	
	private Transaction currentTransaction;

	public CoffeeDao() {
		
	}
    public Session openCurrentSession() {

        currentSession = getSessionFactory().openSession();

        return currentSession;

    }

 
    public Session openCurrentSessionwithTransaction() {

        currentSession = getSessionFactory().openSession();

        currentTransaction = currentSession.beginTransaction();

        return currentSession;

    }

     

    public void closeCurrentSession() {

        currentSession.close();

    }

     

    public void closeCurrentSessionwithTransaction() {

        currentTransaction.commit();

        currentSession.close();

    }

     

    private static SessionFactory getSessionFactory() {

        Configuration configuration = new Configuration().configure();

        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()

                .applySettings(configuration.getProperties());

        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());

        return sessionFactory;

    }

 

    public Session getCurrentSession() {

        return currentSession;

    }

 

    public void setCurrentSession(Session currentSession) {

        this.currentSession = currentSession;

    }

 

    public Transaction getCurrentTransaction() {

        return currentTransaction;

    }

 

    public void setCurrentTransaction(Transaction currentTransaction) {

        this.currentTransaction = currentTransaction;

    }

 

   public void persist(Coffee entity) {

        getCurrentSession().save(entity);

    }

 

    public void update(Coffee entity) {

        getCurrentSession().update(entity);

    }

 

    public Coffee findById(String id) {

    	Coffee coffee = (Coffee) getCurrentSession().get(Coffee.class, id);

        return coffee;

    }

 

    public void delete(Coffee entity) {

        getCurrentSession().delete(entity);

    }

 

    @SuppressWarnings("unchecked")

    public List<Coffee> findAll() {

        List<Coffee> books = (List<Coffee>) getCurrentSession().createQuery("from Coffee").list();

        return books;

    }

 

    public void deleteAll() {

        List<Coffee> entityList = findAll();

        for (Coffee entity : entityList) {

            delete(entity);

        }

    }

	
}