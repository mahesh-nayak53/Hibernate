package sample2;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Orders {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="item")
	private String item;
	
	@Column(name="price")
	private int price;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cst_detail")
	
	private Customer customer;


	public Orders(int id, String item, int price, Customer customer) {
		super();
		this.id = id;
		this.item = item;
		this.price = price;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", item=" + item + ", price=" + price + ", customer=" + customer + "]";
	}
	
	
	
	
}
