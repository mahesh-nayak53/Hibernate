package sample1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/////one to one relationShip

public class App {
	
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Customer.class);
		config.addAnnotatedClass(CustomerDetails.class);
		
		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Customer c = session.get(Customer.class, 91);
		
		CustomerDetails cid = c.getCustomerDetails();
		System.out.println(cid);
		System.out.println(c);
		
		transaction.commit();
		
		
//		Configuration config = new Configuration();
//		config.configure();
//		config.addAnnotatedClass(Customer.class);
//		config.addAnnotatedClass(CustomerDetails.class);
//		
//		SessionFactory sessionfactory = config.buildSessionFactory();
//		Session session = sessionfactory.openSession();
//		
//		Transaction transaction = session.beginTransaction();
//		
//		Customer customer = session.get(Customer.class, 1);
//
//		if (customer != null) {
//		    transaction.begin();
//
//		    session.delete(customer);
//
//		    transaction.commit();
//		    System.out.println("Customer deleted");
//		} else {
//		    System.out.println("Customer not found");
//		}
//		
//		transaction.commit();
//		

		
//		Configuration config = new Configuration();
//		config.configure();
//		config.addAnnotatedClass(Customer.class);
//		config.addAnnotatedClass(CustomerDetails.class);
//		
//		SessionFactory sessionfactory = config.buildSessionFactory();
//		Session session  = sessionfactory.openSession();
//		
//		Transaction transaction = session.beginTransaction();
//		
//		Customer c = session.get(Customer.class, 94);
//		c.getCustomerDetails().setEmail("andy123@gmail.com");
//		session.update(c);
//		transaction.commit();
		

		
//		Configuration config = new Configuration();
//		config.configure();
//		config.addAnnotatedClass(Customer.class);
//		config.addAnnotatedClass(CustomerDetails.class);
//		
//		SessionFactory sessionfactory = config.buildSessionFactory();
//		Session session = sessionfactory.openSession();
//		
//		Transaction transaction = session.beginTransaction();
//		
//		CustomerDetails cd = new CustomerDetails(4,"andy@gmail.com","765321");
//		
//		Customer c = new Customer(94,"andy", cd);
//		session.save(c);
//		
//		transaction.commit();
	}
}
