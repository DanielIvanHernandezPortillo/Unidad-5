package mx.utng.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contact {
	@Id @GeneratedValue
	private Long id;
	private String description;
	
	@JoinColumn @ManyToOne
	private Customer customer;
	
	@JoinColumn @ManyToOne
	private ContactType contactType;
	
	public Contact(String description){
		super();
		this.description = description;
	}
	
	public Contact(){
		this("");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ContactType getContactType() {
		return contactType;
	}

	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", description=" + description + ", customer=" + customer + ", contactType="
				+ contactType + "]";
	}
	
}
