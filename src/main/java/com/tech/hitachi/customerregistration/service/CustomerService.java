package com.tech.hitachi.customerregistration.service;


import com.tech.hitachi.customerregistration.controller.CustomerController;
import com.tech.hitachi.customerregistration.model.Customer;
import com.tech.hitachi.customerregistration.model.Remark;
import com.tech.hitachi.customerregistration.repository.CustomerRepository;
//import com.tech.hitachi.customerregistration.repository.RemarkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class CustomerService {

    public final CustomerRepository customerRepository;
   // public final RemarkRepository remarkRepository;


    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    public CustomerService (CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
//        this.remarkRepository=remarkRepository;
    }



    public Customer addCustomer(Customer customer){

        Customer customer1=new Customer();
        try {
            customer1 = customerRepository.save(customer);
            log.info("customer savedd : {}", customer1);

        }catch (Exception e){
            e.printStackTrace();
            log.error("Error Occured : {}",e);
        }
        return customer1;
    }



    public Optional<Customer> getCustomer(String id){


        Optional<Customer> byId = customerRepository.findById(id);

        return byId;

    }

    public int getCustomerCount(String fromDate,String toDate){//String fromDate,String toDate
       return  customerRepository.getCustomerCount(fromDate,toDate);
    }


//    public Customer addCustomer(Customer customer, Remark remark){
//
//        Customer customer1=new Customer();
//try {
//   customer1 = customerRepository.save(customer);
//    Remark remark1 = remarkRepository.save(remark);
//
//}catch (Exception e){
//    e.printStackTrace();
//}
//        return customer1;
//    }




}
