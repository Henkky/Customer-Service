package id.co.travel.customerapp.controller;

import id.co.travel.customerapp.model.Customer;
import id.co.travel.customerapp.model.CustomerDTO;
import id.co.travel.customerapp.repository.CustomerSDJRepo;
import id.co.travel.customerapp.service.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("custapi")
public class RestCustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> findAll(){
        return customerService.inquiryAll();
    }

    @GetMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Customer findCustomerById(@PathVariable("id") int id){
        return customerService.inquiryById(id);
    }

    @PostMapping("/addcust")
    @ResponseStatus(HttpStatus.OK)
    public Customer addCustomer(@RequestBody CustomerDTO customer){
        return customerService.insert(customer);
    }

    @PutMapping("/updcust")
    @ResponseStatus(HttpStatus.OK)
    public Customer updateCustomer(@RequestBody CustomerDTO customer){
        return customerService.update(customer);
    }

    @DeleteMapping("/delcust/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCustomer(@PathVariable("id") int id){
        customerService.delete(id);
    }
}
