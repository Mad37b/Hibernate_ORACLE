package com.iesVda.persistence;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;




//import jakarta.persistence.criteria.CriteriaQuery;



public class employeeDao {
	
	
	public void saveEmployee(employees aEmployee) {
		Transaction transaction = null;
		try (Session session = hibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the country object
			session.save(aEmployee);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
			transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	
	public void updateEmployee(employees aEmployee) {
		Transaction transaction = null;
		try (Session session = hibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the country object
			session.saveOrUpdate(aEmployee);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
			transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	public employees getEmployeeById(int aEmployee) {
		Transaction transaction = null;
		employees employee=new employees();
		
		try (Session session = hibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			
			employee =session.createQuery("from employees where employee_id="+aEmployee,employees.class).uniqueResult();
			transaction = session.beginTransaction();
		
		
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
			transaction.rollback();
			}
			e.printStackTrace();
		}
		
		return employee;
	}
	
	
	public employees getEmployee(int aEmployee) {
		Transaction transaction = null;
		employees employee=new employees();
		
		try (Session session = hibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			
			employee =session.get(employees.class,aEmployee);
			transaction = session.beginTransaction();
		
		
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
			transaction.rollback();
			}
			e.printStackTrace();
		}
		
		return employee;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<countries> getAllUser() {

		Transaction transaction = null;
		List<countries> listOfCountries = null;
		try (Session session = hibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			
			listOfCountries = session.createQuery("from countries").getResultList();
			
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listOfCountries;
	}
}