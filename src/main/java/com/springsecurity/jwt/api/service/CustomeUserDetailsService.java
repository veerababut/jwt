package com.springsecurity.jwt.api.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springsecurity.jwt.api.entity.User;
import com.springsecurity.jwt.api.repo.UserServiceRepository;

@Service
public class CustomeUserDetailsService implements UserDetailsService {

	@Autowired
	
	public UserServiceRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repo.findByUserName(username);
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
				new ArrayList<>());
	}

}
