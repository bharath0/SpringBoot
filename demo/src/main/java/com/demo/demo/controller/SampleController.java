package com.demo.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SampleController {

	@GetMapping("/")
	public ResponseEntity<String> welcomeUser(){
		return new ResponseEntity<String>("Welcome to Spring Boot",HttpStatus.OK);
	}
}
