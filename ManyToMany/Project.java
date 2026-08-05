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
@Table(name="Project")
public class Project {
	
	@Id
	@Column(name="project_id")
	private int id;
	
	@Column(name="project_name")
	private String name;
	
	@ManyToMany(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinTable(name="employee_project",
	joinColumns = @JoinColumn(name="project_id"),
	inverseJoinColumns=@JoinColumn(name="employee_id"))
	private List<Employee> employee;
	
	public Project() {
		
	}
	
	public Project(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Project(int id, String name, List<sample3.Employee> employee) {
		super();
		this.id = id;
		this.name = name;
		employee = employee;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", Employee=" + employee + "]";
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

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		employee = employee;
	}

	
	
	
}
