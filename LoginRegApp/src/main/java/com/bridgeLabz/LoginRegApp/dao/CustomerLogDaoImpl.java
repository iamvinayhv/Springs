package com.bridgeLabz.LoginRegApp.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bridgeLabz.LoginRegApp.model.Customer;

public class CustomerLogDaoImpl implements CustomerLogDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Customer login(String email, String password) {
		
		
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			
			Criteria criteria  = session.createCriteria(Customer.class);
			Customer customer = (Customer) criteria.add(Restrictions.conjunction().add(Restrictions.eq("email", email)).add(Restrictions.eq("password", password))).uniqueResult();
			
			
			
			
			/*String hql = "from Customer where email=:e and password=:p";
			
			Query query = session.createQuery(hql);
			query.setParameter("e", email);
			query.setParameter("p", password);
			Customer customer = (Customer) query.uniqueResult();*/
			
			
			transaction.commit();
			session.close();
			return customer;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
