package mx.utng.practice.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity @Table(name="customers")
public class Customer {
	@Id @GeneratedValue
	private Long id;
	private String name;
	
	@OneToMany (cascade=CascadeType.ALL,
			mappedBy="customer",fetch=FetchType.EAGER)
	private List<Contact> contacts =
	new ArrayList<Contact>();
	
	
	@JoinColumn
	@ManyToOne
	private State state;
	
	public Customer(String name) {
		super();
		this.name = name;
		
	}
	
	public Customer() {
		this("");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

}
