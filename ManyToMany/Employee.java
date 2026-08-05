package sample3;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name="employee_id")
	private int id;
	
	@Column(name="employee_name")
	private String name;
	
//	@ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,CascadeType.REFRESH})
//	@JoinTable(name = "employee_project",
//	joinColumns = @JoinColumn(name="employee_id"), 
//	inverseJoinColumns = @JoinColumn(name="project_id"))
//	
	@ManyToMany(mappedBy = "employee")
	private List<Project> projects;
	
	public Employee() {
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name =name;
	}
	
	public Employee(int id, String name, List<Project> projects) {
		super();
		this.id = id;
		this.name = name;
		this.projects = projects;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", projects=" + projects + "]";
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

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
}
