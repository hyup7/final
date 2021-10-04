package com.first.springboot.model.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {

	private String name;
	private int age;
	private String addr;
	
}
