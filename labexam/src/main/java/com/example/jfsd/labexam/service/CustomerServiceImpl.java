package com.example.jfsd.labexam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jfsd.labexam.model.Customer;
import com.example.jfsd.labexam.repository.CustomerRepository;
@Service
public class CustomerServiceImpl  implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public void CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
	@Override
	public List<Customer> getAllCustomers() {
		
		return  customerRepository.findAll();
	}

	
}
