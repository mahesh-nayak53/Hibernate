package sample2;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) {
		
		
		
		
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Customer.class);
		config.addAnnotatedClass(CustomerDetails.class);
		config.addAnnotatedClass(Orders.class);
		
		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Customer c = session.get(Customer.class, 94);
		

		if (c != null) {
		    System.out.println(c.getCustomerDetails());
		} else {
		    System.out.println("Customer not found");
		}
		
		CustomerDetails cd = c.getCustomerDetails();
		List<Orders> orders = c.getOrders();
		
		System.out.println(c);
		System.out.println(cd);
		
		for(Orders order:orders) {
			System.out.println(order);
		}
		
		transaction.commit();
		
		
		
//		Configuration config = new Configuration();
//		config.configure();
//		config.addAnnotatedClass(Customer.class);
//		config.addAnnotatedClass(CustomerDetails.class);
//		config.addAnnotatedClass(Orders.class);
//		
//		SessionFactory sessionfactory = config.buildSessionFactory();
//		Session session = sessionfactory.openSession();
//		
//		Transaction transaction = session.beginTransaction();
//		
//		CustomerDetails cd = new CustomerDetails(5,"alex@gmail.com","88880808808");
//		
//		Customer c = new Customer(95,"alex", cd);
//		
//		Orders o1 = new Orders(704,"fires",260,c);
//		Orders o2 = new Orders(705,"pizza",310,c);
//		
//		session.save(o1);
//		session.save(o2);
//		
//		transaction.commit();
		
	

	}

}
