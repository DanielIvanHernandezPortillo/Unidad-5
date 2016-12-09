package mx.utng.practice.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Test; 
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import mx.utng.practice.model.Customer;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(connection=EmbeddedDatabaseConnection.H2, replace=Replace.ANY)
public class TestRepository {
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private EntityManager entityManager;
	
	@Test
	public void testSave(){
		Customer customer = new Customer("Chencho Placencio");
		Customer custSaved= customerRepository.save(customer);
		Assert.assertNotNull(custSaved);
		
	}
	
	
	@Test
	public void testFindAll(){
		Customer customer1 = new Customer("Chencho Placencio");
		entityManager.persist(customer1);
		Customer customer2 = new Customer ("Tacho Rodriguez");
		entityManager.persist(customer2);
		
	List<Customer> customers = customerRepository.findAll();
	assertThat(customers.get(0).getName()).isEqualTo(customer1.getName());
	assertThat(customers.get(1).getName()).isEqualTo(customer2.getName());
	}
	

}
