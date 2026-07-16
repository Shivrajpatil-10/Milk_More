package org.example.milk_more.Repository;

import org.example.milk_more.entity.Cust_Info;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Cust_Info, Long>{
	
}




