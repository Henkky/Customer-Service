package id.co.travel.customerapp.controller;

import id.co.travel.customerapp.repository.model.Customer;
import id.co.travel.customerapp.model.CustomerDTO;
import id.co.travel.customerapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> findAll() {
        return customerService.inquiryAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Customer findCustomerById(@PathVariable("id") int id) {
        return customerService.inquiryById(id);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public Customer addCustomer(@RequestBody CustomerDTO customer) {
        return customerService.insert(customer);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public Customer updateCustomer(@RequestBody CustomerDTO customer) {
        return customerService.update(customer);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCustomer(@PathVariable("id") int id) {
        customerService.delete(id);
    }
}
