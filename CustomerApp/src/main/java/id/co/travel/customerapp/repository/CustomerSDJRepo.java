package id.co.travel.customerapp.repository;

import id.co.travel.customerapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerSDJRepo extends JpaRepository<Customer, Integer> {
    Customer findCustomerById(Integer aInteger);
}
