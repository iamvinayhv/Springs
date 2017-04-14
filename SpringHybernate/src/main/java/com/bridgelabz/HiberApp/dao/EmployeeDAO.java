package com.bridgelabz.HiberApp.dao;

import org.springframework.orm.hibernate4.HibernateTemplate;

import com.bridgelabz.HiberApp.model.Employee;

public class EmployeeDAO {

	HibernateTemplate template;
	
	public void setTemplete(HibernateTemplate template) {
		this.template=template;
	}
	
	public void saveEmployee(Employee emp) {
		
		template.save(emp);
	}
}
