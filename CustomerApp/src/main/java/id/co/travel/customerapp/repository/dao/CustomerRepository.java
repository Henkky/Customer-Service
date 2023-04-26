package id.co.travel.customerapp.repository.dao;

import id.co.travel.customerapp.repository.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findCustomerById(Integer aInteger);
}
