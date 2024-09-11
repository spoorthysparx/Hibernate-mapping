package com.hexa.random.com.hexa.ran;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class App {
 
	public static void main(String[] args) {
		Stud user = new Stud(); //create the user entity
		Certificate vehicle = new Certificate(); //create the vehicle entity
 
		vehicle.setVehicleName("maruti"); //set vehicle name
 
		user.setUserName("siraj"); //set the user name
		user.setVehicle(vehicle); //set the vehicle entity to the field of the user entity i.e. vehicle entity inside the user entity
 
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); //create session factory object
		Session session = sessionFactory.openSession(); //create the session object
		session.beginTransaction();//create the transaction from the session object
 
		session.save(vehicle); // save the vehicle entity to the database
		session.save(user); // save the user entity to the database
 
		session.getTransaction().commit(); //close the transaction
		session.close(); //close the session
 
	}
 
}
