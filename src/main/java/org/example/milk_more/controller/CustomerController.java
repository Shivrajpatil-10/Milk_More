package org.example.milk_more.controller;

import org.example.milk_more.Service.Customer_Service;
import org.example.milk_more.entity.Cust_Info;
import org.example.milk_more.wrapper.ApiResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/milkmore")
public class CustomerController {
	  private final Customer_Service customer_service;


	    public CustomerController(Customer_Service customer_service) {
	        this.customer_service = customer_service;
	    }
	
	 @PostMapping("/save")
	    public  Cust_Info save(@RequestBody Cust_Info customer){

	        return customer_service.saveCustomer(customer);

	    }
    
   
    
   
}
