package com.lucasvaz.webservices.VazCommerce.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasvaz.webservices.VazCommerce.entities.User;

@RestController
@RequestMapping(value = "/users")

public class UserResource {
	
	@GetMapping

	public ResponseEntity<User> findAll() {
		User u = new User(1l, "Lucas", "lucasvaz@gmail.com", "55555", "222");
		return ResponseEntity.ok().body(u);

	}
}