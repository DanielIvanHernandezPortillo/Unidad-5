package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Customer;

@Repository
public interface CustomerRepository 
extends JpaRepository<Customer, Long>{
	
	
	@Query ("select cust from Customer cust")
	public List<Customer> findAll();
	
}
