package Backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Backend.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	
	@Query(value ="SELECT * FROM account,customer c WHERE account.email=c.email and c.email =:Email and account.password =:Password",nativeQuery = true)
	public Customer loginCustomer(@Param("Email") String email,@Param("Password") String pass);
	
	@Query(value ="SELECT * FROM customer WHERE customer_id=:ParamID",nativeQuery = true)
	public Customer getById(@Param("ParamID") int customerID);
	
}