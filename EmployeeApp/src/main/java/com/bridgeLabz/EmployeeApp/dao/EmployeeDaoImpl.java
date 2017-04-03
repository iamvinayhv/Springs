package com.bridgeLabz.EmployeeApp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgeLabz.EmployeeApp.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveEmployee(Employee employee) {
		
		System.out.println(employee);
		
		Session session=sessionFactory.openSession();
		Transaction tr = null;
		try{
			tr = session.beginTransaction();
			session.saveOrUpdate(employee);
			tr.commit();
		}
		catch(Exception e)
		{
			tr.rollback();
		}
		finally {
			session.close();
		}
	}
	
	
	@Override
	public Employee alreadyReg(String mail) {
		
		Employee employee =null;
		
		Session session=sessionFactory.openSession();
		Transaction tr = null;
		
		String qry = "from Employee where Mail = :mail";
		Query query = session.createQuery(qry);
		query.setParameter("mail", mail);
		employee = (Employee) query.uniqueResult();
		
		
		return employee;
	}
	

	@Override
	public Employee authUser(String mail, String password) {
		
		Session session=sessionFactory.openSession();
		Transaction transaction = null;
		try{
			Criteria ctr = session.createCriteria(Employee.class);
			Employee employee = (Employee) ctr.add(Restrictions.conjunction().add(Restrictions.eq("mail", mail))
					.add(Restrictions.eq("password", password))).uniqueResult();
			return employee;
		}
		catch(Exception e)
		{
			transaction.rollback();
			return null;
		}
		finally {
			session.close();
		}
		
	}


	@Override
	public List users() {
		
		Session session=sessionFactory.openSession();
		Transaction transaction = null;
		
		String qry="select mail from Employee";
		Query query=session.createQuery(qry);
		List users=query.getResultList();
		
		return users;
	}

	

	
}
