package id.co.travel.customerapp.service;

import id.co.travel.customerapp.model.Customer;
import id.co.travel.customerapp.model.CustomerDTO;
import id.co.travel.customerapp.model.GenderData;
import id.co.travel.customerapp.repository.CustomerSDJRepo;
import id.co.travel.customerapp.repository.GenderDataSDJRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerSDJRepo customerSDJRepo;

    @Autowired
    GenderDataSDJRepo genderDataSDJRepo;

    public Customer insert(CustomerDTO customer){
        Customer custToInput = new Customer();
        custToInput.setId(customer.getId());
        custToInput.setName(customer.getName());
        GenderData genderInp = genderDataSDJRepo.findGenderDataByGenderid(customer.getGender());
        custToInput.setGender(genderInp);
        custToInput.setEmail(customer.getEmail());
        return customerSDJRepo.save(custToInput);
    }

    public Customer update(Customer customer){
        return customerSDJRepo.save(customer);
    }

    public void delete(int id){
        customerSDJRepo.deleteById(id);
    }

    public List<Customer> inquiryAll(){
        return customerSDJRepo.findAll();
    }

    public Customer inquiryById(Integer id){
        return customerSDJRepo.findCustomerById(id);
    }

}
