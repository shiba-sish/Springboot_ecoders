package com.example.ecoders.DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.ecoders.entity.Employee;

import jakarta.persistence.EntityManager;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	private EntityManager entitymanager;
	
	@Autowired
	EmployeeDAOImpl(EntityManager entitymanager) {
	this.entitymanager=entitymanager;
	}
	@Override
	public List<Employee> findAll(){
		Session currentSession= entitymanager.unwrap(Session.class);
		Query<Employee> theQuery=currentSession.createQuery("from Employee", Employee.class);
		List<Employee> employees = theQuery.getResultList();
		return employees;
	}
	
	@Override
	public Employee findById(int id) {
		Session currentSession = entitymanager.unwrap(Session.class);
		Employee theEmployee = currentSession.get(Employee.class, id); 
		return theEmployee;
	}
	
	@Override
	public void save(Employee theEmployee) {
		Session currentSession = entitymanager.unwrap(Session.class);
		//if id=0 or else update using that id using saveorpdate methdod from hibernate
		currentSession.saveOrUpdate(theEmployee);	
	}
	
	@Override
	public void deleteById(int theid) {
		
		Session currentSession = entitymanager.unwrap(Session.class);
		Query theQuery=currentSession.createQuery("delete from Employee where id =:theid");
		theQuery.setParameter("theid", theid);
		theQuery.executeUpdate();	
	}
}