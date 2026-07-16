package org.example.milk_more.Service;

import org.example.milk_more.Repository.CustomerRepo;
import org.example.milk_more.entity.Cust_Info;
import org.springframework.stereotype.Service;

@Service
public class Customer_Service {
	  private final CustomerRepo customerrepo;

	    public Customer_Service(CustomerRepo customerrepo) {
	        this.customerrepo = customerrepo;
	    }
	
	public Cust_Info saveCustomer(Cust_Info c) {
		
		
		return customerrepo.save(c);
	}
	

}
