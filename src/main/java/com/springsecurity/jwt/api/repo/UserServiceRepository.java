package com.springsecurity.jwt.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.jwt.api.entity.User;
@Repository
public interface UserServiceRepository extends JpaRepository<User, Long> {

	User findByUserName(String username);

}
