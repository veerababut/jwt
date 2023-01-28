package com.springsecurity.jwt.api.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.jwt.api.entity.AuthRequest;
import com.springsecurity.jwt.api.utility.JwtUtil;

@RestController
public class WelcomeControll {

	@Autowired
	public JwtUtil jwtUtil;

	@Autowired
	public AuthenticationManager authManager;

	@GetMapping("/")
	public String welcome() {

		return "Welcome to jwt project";
	}

	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {

		try {
			authManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));
		} catch (Exception e) {
			throw new Exception("Invalid Username/Password");
		}

		return jwtUtil.generateToken(authRequest.getUserName());
	}

}
