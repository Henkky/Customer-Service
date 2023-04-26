package id.co.travel.customerapp.service;

import id.co.travel.customerapp.model.CustomerDTO;
import id.co.travel.customerapp.repository.dao.CustomerRepository;
import id.co.travel.customerapp.repository.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer insert(CustomerDTO customer) {
        Customer customerInput = new Customer();
        customerInput.setId(customer.getId());
        customerInput.setName(customer.getName());
        customerInput.setGender(customer.getGender());
        customerInput.setEmail(customer.getEmail());
        return customerRepository.save(customerInput);
    }

    public Customer update(CustomerDTO customer) {
        Customer customerInput = customerRepository.findCustomerById(customer.getId());
        customerInput.setId(customer.getId());
        customerInput.setName(customer.getName());
        customerInput.setGender(customer.getGender());
        customerInput.setEmail(customer.getEmail());
        //BeanUtils.copyProperties(customer,customerInput);
        return customerRepository.save(customerInput);
    }

    public void delete(int id) {
        customerRepository.deleteById(id);
    }

    public List<Customer> inquiryAll() {
        return customerRepository.findAll();
    }

    public Customer inquiryById(Integer id) {
        return customerRepository.findCustomerById(id);
    }

}
