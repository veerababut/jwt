package com.springsecurity.jwt.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.springsecurity.jwt.api.entity")
@EnableJpaRepositories
public class JwtApplication {

	/*
	 * @Autowired public UserServiceRepository repo;
	 * 
	 * @PostConstruct public void insertUsers() { List<User> users = Stream.of(new
	 * User(101l, "veeru", "veeru", "veru@gmail.com"), new User(102l, "usr1",
	 * "usr1", "usr1@gmail.com"), new User(102l, "usr2", "usr2", "usr2@gmail.com"))
	 * .collect(Collectors.toList()); repo.saveAll(users); }
	 */

	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);
	}

}
