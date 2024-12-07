package com.example.jfsd.labexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jfsd.labexam.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
