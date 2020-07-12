package com.prft.sbrestmongo.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prft.sbrestmongo.application.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	UserRepository customerrepository;
	
	
	
	   @RequestMapping(value = "/getAllUsers")
	   public ResponseEntity<Object> getAllUsers() {
		   // Parameter parsing
		   // service call
		   return new ResponseEntity<>(customerrepository.findAll(),HttpStatus.OK);
	   }
	   // test methods
	   @RequestMapping(value = "/{name}")
	   public String hello(@PathVariable("name") String name)
	   { 
		   return "Welcome "+name;
		 
	   }
	   // test methods
	   @RequestMapping(value = "/")
	   public String hello()
	   { 
		   return "Welcome Unknown";
		 
	   }

}
