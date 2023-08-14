package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.Repo;
import com.example.demo.User.Customer;

@RestController
public class Control {
	
	@Autowired
	public Repo rep;
	
	@PostMapping ("/add")
	public Customer adddata(@RequestBody Customer user) {
		rep.save(user);
		return user;
	}
	@GetMapping("/users")
	public List<Customer> getAllUsers(){
		return rep.findAll();
	
	}	
	@GetMapping("/getbyid/{id}")
	public Optional<Customer> getone (@PathVariable int id){
		return rep.findById(id);
	}
	@PostMapping("/addproduct")
	public Customer newcus (@RequestBody Customer customer) {
		return rep.save(customer);
	}
	@PutMapping("/update")
	public Customer update(@RequestBody Customer product) {
		return rep.save(product);
	}
	@DeleteMapping ("/delete/{id}")
	public String delete(@PathVariable int id) {
		
		@SuppressWarnings("deprecation")
		Customer cus=rep.getOne(id);
		rep.delete(cus);
		return "delete";
	}
}
