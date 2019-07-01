package com.hhplanner.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hhplanner.model.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Long> {
	  List<Customer> findByAge(int age);
}
