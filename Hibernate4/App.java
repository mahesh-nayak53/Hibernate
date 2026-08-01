package sample3;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		//load
		
		Configuration config = new Configuration();
		config.configure();
		
		config.addAnnotatedClass(Employee.class);
		config.addAnnotatedClass(Project.class);
		
		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee e = session.load(Employee.class, 1);
		System.out.println(e);
		
		transaction.commit();
		
		//get
		
		
//		Configuration config = new Configuration();
//		config.configure();
//		
//		config.addAnnotatedClass(Employee.class);
//		config.addAnnotatedClass(Project.class);
//		
//		SessionFactory sessionfactory = config.buildSessionFactory();
//		Session session = sessionfactory.openSession();
//		Transaction transaction = session.beginTransaction();
//		
//		Employee e = session.get(Employee.class, 1);
//		System.out.println(e);
//		
//		transaction.commit();
		
		
//		Configuration config = new Configuration();
//		config.configure();
//		config.addAnnotatedClass(Employee.class);
//		config.addAnnotatedClass(Project.class);
//		
//		SessionFactory sessionfactory = config.buildSessionFactory();
//		Session session = sessionfactory.openSession();
//		
//		Transaction transaction = session.beginTransaction();
//		
//		Employee e = session.load(Employee.class, 1);
//		
//		System.out.println(e);
//		
//		
//		transaction.commit();
		
		
		
		
//		Configuration config = new Configuration();
//		config.configure();
//		
//		config.addAnnotatedClass(Employee.class);
//		config.addAnnotatedClass(Project.class);
//		
//		SessionFactory sessionfactory = config.buildSessionFactory();
//		Session session = sessionfactory.openSession();
//		
//		Transaction transaction = session.beginTransaction();
//		
//		Employee e = session.get(Employee.class, 1);
//		System.out.println(e);
//		transaction.commit();
		
		
		
//		Configuration config = new Configuration();
//		config.configure();
//		config.addAnnotatedClass(Employee.class);
//		config.addAnnotatedClass(Project.class);
//		
//		SessionFactory sessionfactory = config.buildSessionFactory();
//		Session session = sessionfactory.openSession();
//		
//		Transaction transaction = session.beginTransaction();
//		
//		
//		Project p = session.get(Project.class, 1);
//		session.delete(p);
//		
//		transaction.commit();
		

//		Configuration config = new Configuration();
//		config.configure();
//		
//		config.addAnnotatedClass(Employee.class);
//		config.addAnnotatedClass(Project.class);
//		
//		SessionFactory sessionfactory = config.buildSessionFactory();
//		Session session = sessionfactory.openSession();
//		Transaction transaction = session.beginTransaction();
//		
//		Project p = session.get(Project.class, 1);
//		List<Employee> employees = p.getEmployee();
//		
//		System.out.println(p);
//		
//		for(Employee employee : employees) {
//			System.out.println(employee);
//		}
//		
//		transaction.commit();
//		
		
		
//		Configuration config = new Configuration();
//		
//		config.configure();
//		config.addAnnotatedClass(Employee.class);
//		config.addAnnotatedClass(Project.class);
//		
//		SessionFactory  sessionfactory = config.buildSessionFactory();
//		Session session = sessionfactory.openSession();
//		Transaction transaction = session.beginTransaction();
//		
//		Employee employee = session.get(Employee.class, 1);
//		List<Project> projects = employee.getProjects();
//		
//		System.out.println(employee);
//		
//		for(Project project : projects) {
//			System.out.println(project);
//		}
//				
//		
//		transaction.commit();
//		
		

		
		
//		Configuration config = new Configuration();
//		config.configure();
//		config.addAnnotatedClass(Employee.class);
//		config.addAnnotatedClass(Project.class);
//		
//		SessionFactory sessionfactory = config.buildSessionFactory();
//		Session session = sessionfactory.openSession();
//		
//		Transaction transaction = session.beginTransaction();
//		
//		Project pr = new Project(1,"Premierpro");
//		Project af = new Project(2,"Aftereffects");
//		
//		Employee alex = new Employee(1,"Alex");
//		Employee bob = new Employee(2,"Bob");
//		Employee charli = new Employee(3,"charli");
//		
//		ArrayList<Employee> premployees = new ArrayList<>();
//		ArrayList<Employee> afemployees = new ArrayList<>();
//		
//		premployees.add(alex);
//		premployees.add(bob);
//		premployees.add(charli);
//		
//		pr.setEmployee(premployees);
//		afemployees.add(bob);
//		afemployees.add(charli);
//		af.setEmployee(afemployees);
//		session.save(alex);
//		session.save(bob);
//		session.save(pr);
//		session.save(af);
//		
//		transaction.commit();
		
	}
}
