package com.first.springboot.model.vo;

import lombok.Data;

@Data
public class Member {

	private String userId;
	private String password;
	private String userName;
	private String gender;
	private int age;
	private String email;

}
