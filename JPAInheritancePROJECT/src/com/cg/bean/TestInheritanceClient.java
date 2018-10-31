package com.cg.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestInheritanceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=fact.createEntityManager();
		EntityTransaction tran=em.getTransaction();
		Employee e1=new Employee();
		e1.setEmpId(111);
		e1.setEmpName("Ankit");
		e1.setEmpSal(1000);
		
		Manager e2=new Manager();
		e1.setEmpId(222);
		e1.setEmpName("RAM");
		e1.setEmpId(5000);
		e2.setDeptName("IT");
		
		tran.begin();
		em.persist(e1);
		em.persist(e2);
		tran.commit();
		System.out.println("data added");
	}

}
