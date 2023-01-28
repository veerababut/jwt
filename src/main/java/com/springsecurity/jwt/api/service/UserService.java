package com.springsecurity.jwt.api.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springsecurity.jwt.api.entity.User;
import com.springsecurity.jwt.api.repo.UserServiceRepository;

@Component
public class UserService {

	@Autowired
	public UserServiceRepository repo;

	@PostConstruct
	public void insertUsers() {
		List<User> users = Stream.of(new User(101l, "veeru", "veeru", "veru@gmail.com"),
				new User(102l, "usr1", "usr1", "usr1@gmail.com"), new User(103l, "usr2", "usr2", "usr2@gmail.com"))
				.collect(Collectors.toList());
		repo.saveAll(users);
	}

}
