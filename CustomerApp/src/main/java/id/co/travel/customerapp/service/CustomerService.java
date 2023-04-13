package id.co.travel.customerapp.service;

import id.co.travel.customerapp.model.Customer;
import id.co.travel.customerapp.model.CustomerDTO;
import id.co.travel.customerapp.model.GenderData;
import id.co.travel.customerapp.repository.CustomerSDJRepo;
import id.co.travel.customerapp.repository.GenderDataSDJRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerSDJRepo customerSDJRepo;

    @Autowired
    GenderDataSDJRepo genderDataSDJRepo;

    //Customer customerInput = new Customer();

    public Customer insert(CustomerDTO customer){
        Customer customerInput = new Customer();
        customerInput.setId(customer.getId());
        customerInput.setName(customer.getName());
        GenderData genderInp = genderDataSDJRepo.findGenderDataByGenderid(customer.getGender());
        customerInput.setGender(genderInp);
        customerInput.setEmail(customer.getEmail());
        return customerSDJRepo.save(customerInput);
    }

    public Customer update(CustomerDTO customer){
        Customer customerInput = customerSDJRepo.findCustomerById(customer.getId());
        customerInput.setId(customer.getId());
        customerInput.setName(customer.getName());
        GenderData genderInp = genderDataSDJRepo.findGenderDataByGenderid(customer.getGender());
        customerInput.setGender(genderInp);
        customerInput.setEmail(customer.getEmail());
        //BeanUtils.copyProperties(customer,customerInput);
        return customerSDJRepo.save(customerInput);
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
