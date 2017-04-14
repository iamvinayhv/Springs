package com.bridgeLabz.CustomerProduct.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeLabz.CustomerProduct.model.Customar;

public class CustomerProductDaoImpl implements CustomerProductDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addDetails(Customar customer) {
		
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
