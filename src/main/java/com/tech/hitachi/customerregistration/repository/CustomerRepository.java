package com.tech.hitachi.customerregistration.repository;

import com.tech.hitachi.customerregistration.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,String> {




    @Query(value = "select count(*) from CUSTOMER  WHERE reg_date BETWEEN :fromdate AND :todate" ,nativeQuery = true)
    Integer getCustomerCount(@Param("fromdate") String fromdate, @Param("todate") String todate);

}












