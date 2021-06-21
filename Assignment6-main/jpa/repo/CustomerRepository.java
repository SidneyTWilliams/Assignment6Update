package com.MeritBankAppjpa.jpa.repo;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.MeritBankAppjpa.jpa.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	  List<Customer> findByLastName(String lastName);

	  Customer findById(long id);
	  Customer findBySsn(String ssn);
	}