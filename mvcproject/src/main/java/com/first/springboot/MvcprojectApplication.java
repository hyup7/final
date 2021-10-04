package com.first.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.first.springboot.model.mapper")
public class MvcprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcprojectApplication.class, args);
	}

}
