package com.springsecurity.jwt.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USR_TBL")
public class User {
	@Id
	public Long id;
	public String userName;
	public String password;
	public String emial;
	

}
