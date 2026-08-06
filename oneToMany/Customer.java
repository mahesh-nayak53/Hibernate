package sample2;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@Column(name ="id")
	
	private int id;
	
	@Column(name="name")
	private String name;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cid")
	private CustomerDetails customerDetails;
	
	@OneToMany(mappedBy="customer")
	private List<Orders> orders;
	
	public Customer() {
		
	}
	
	public Customer(int i, String string, CustomerDetails cd) {
		
	}

	public Customer(int id, String name, CustomerDetails customerDetails, List<Orders> orders) {
		super();
		this.id = id;
		this.name = name;
		this.customerDetails = customerDetails;
		this.orders = orders;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", customerDetails=" + customerDetails + ", orders=" + orders
				+ "]";
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

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	
	
}
