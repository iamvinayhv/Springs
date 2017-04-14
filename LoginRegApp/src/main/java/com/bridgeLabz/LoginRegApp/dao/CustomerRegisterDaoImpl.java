package com.bridgeLabz.LoginRegApp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeLabz.LoginRegApp.model.Customer;

public class CustomerRegisterDaoImpl implements CustomerRegisterDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean addCoustomer(Customer customer) {
		
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			session.save(customer);
			transaction.commit();
			session.close();
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
