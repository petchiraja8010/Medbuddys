package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.User.Customer;
@Repository
public interface Repo extends JpaRepository<Customer,Integer>{


}
