package demo.spring.data.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>, CustomerRepositoryCustom {
	
	List<Customer> findByLastName(String lastName);

}