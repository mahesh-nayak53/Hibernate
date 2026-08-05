 package sample;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "Employee")
@Entity
public class Employee {
		
		@Id
		@Column(name="id")
		private int id;
		
		@Column(name = "name")
		private String name;
		
		@Column(name="email")
		private String email;
		
		@Column(name = "desig")
		private String desig;
		
		@Column(name="salary")
		private int salary;

		public Employee() {
			
		}
		public Employee(int id, String name, String email, String desig, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.desig = desig;
			this.salary = salary;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getDesig() {
			return desig;
		}
		public void setDesig(String desig) {
			this.desig = desig;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
}
