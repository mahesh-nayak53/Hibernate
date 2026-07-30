package sample;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;




public class App {
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Employee.class);
		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction  transaction = session.beginTransaction();
		
		String q = "delete from Employee where id = 101";
		
		Query query = session.createQuery(q);
		query.executeUpdate();
		
		transaction.commit();
		
		
		
//		Configuration config = new Configuration();
//		config.configure();
//		
//		config.addAnnotatedClass(Employee.class);
//		SessionFactory sessionfactory = config.buildSessionFactory();
//		Session session = sessionfactory.openSession();
//		Transaction transaction = session.beginTransaction();
//		
//		Query query = session.createQuery("update Employee set salary = salary+1000 where desig = 'HR'");
//		query.executeUpdate();
//		
//		transaction.commit();
		
		
		
//		Configuration config = new Configuration();
//		config.configure();
//		
//		config.addAnnotatedClass(Employee.class);
//		SessionFactory sessionfactory = config.buildSessionFactory();
//		Session session = sessionfactory.openSession();
//		Transaction transaction = session.beginTransaction();
//		
//		Employee employee = session.get(Employee.class,101);
//		
//		employee.setSalary(7000);
//		session.update(employee);
//		transaction.commit();
		
		
//		Configuration config = new Configuration();
//		
//		config.configure();
//		config.addAnnotatedClass(Employee.class);
//		SessionFactory sessionfactory = config.buildSessionFactory();
//		Session session = sessionfactory.openSession();
//		Transaction transaction = session.beginTransaction();
//		
//		Query<Employee> query = session.createQuery("FROM Employee", Employee.class);
//		
//		List<Employee> employees = query.list();
//		
//		for(Employee emp : employees) {
//			System.out.println(emp.getId());
//		}
//		
//		transaction.commit();
		
//		Configuration config = new Configuration();
//		
//		config.configure();
//		
//		config.addAnnotatedClass(Employee.class);
//		
//		SessionFactory sessionfactory = config.buildSessionFactory();
//		
//		Session session = sessionfactory.openSession();
//		
//		Transaction transaction = session.beginTransaction();
//		
//		Employee e = new Employee(101, "mahesh","mahesh@gmail.com", "HR", 60000);
//		session.save(e);
//		transaction.commit();
		
		
		
		
	}
}
