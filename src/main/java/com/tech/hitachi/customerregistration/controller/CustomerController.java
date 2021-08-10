package com.tech.hitachi.customerregistration.controller;


import com.tech.hitachi.customerregistration.model.Customer;
import com.tech.hitachi.customerregistration.repository.CustomerRepository;
import com.tech.hitachi.customerregistration.service.CustomerService;
import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class CustomerController {


    private static final Logger log = LoggerFactory.getLogger(CustomerController.class);

    private final CustomerService customerService;

    private final CustomerRepository customerRepository;


    public CustomerController (CustomerRepository customerRepository,CustomerService customerService){
        this.customerRepository=customerRepository;
        this.customerService=customerService;

    }


    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        System.out.println("");
        return customerRepository.findAll();
    }

    @GetMapping("/customers/{id}")
    public Optional<Customer> getCustomerByID(@PathVariable String id){
        System.out.println("");
        return customerService.getCustomer(id);
    }

    @GetMapping("/customers/{fromDate}/{toDate}")
    public int getCustomerCount(@PathVariable String fromDate,@PathVariable String toDate){

        return customerService.getCustomerCount(fromDate,toDate);

        //return customerService.getCustomerCount();
    }



//    @PostMapping("/customers")
//    public Customer customerCreate(@RequestBody Customer customer){
//        return customerService.addCustomer(customer);
//    }


    @PostMapping("/customers")
    public Customer customerCreate(@RequestBody Customer customer){
        try{
            return customerService.addCustomer(customer);
        } catch (ConstraintViolationException e){
            return null;
        }
    }



}
