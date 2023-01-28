package com.springsecurity.jwt.api.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String userName;
	public String password;

}
