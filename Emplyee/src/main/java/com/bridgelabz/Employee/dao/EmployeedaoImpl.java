package com.bridgelabz.Employee.dao;





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bridgelabz.Employee.model.Employee;

@Repository
@Transactional
public class EmployeedaoImpl implements Employeedao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void saveEmployee(Employee employee) {
		Session session=sessionFactory.getCurrentSession();
		session.save(employee);
	}

	
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

}
