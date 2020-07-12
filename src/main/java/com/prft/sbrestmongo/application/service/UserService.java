package com.prft.sbrestmongo.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.prft.sbrestmongo.application.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userepository;

	public ResponseEntity<Object> findAllUsers(){
         //Parameter validation
		 // Business logic
		 // DB call
		return new ResponseEntity<>(userepository.findAll(),HttpStatus.OK);
	}
	
}

