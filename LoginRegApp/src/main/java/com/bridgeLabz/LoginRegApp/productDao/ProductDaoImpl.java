package com.bridgeLabz.LoginRegApp.productDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeLabz.LoginRegApp.productModel.CustomerProduct;

public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public boolean addProduct(CustomerProduct product) {
		
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			session.save(product);
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
