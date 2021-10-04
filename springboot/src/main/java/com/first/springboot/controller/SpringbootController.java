package com.first.springboot.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.springboot.model.vo.Person;

@RestController
public class SpringbootController {

		@Autowired
		SqlSession session;
		
//		public String firstMethod() {
//			return "Hello SpringBoot";
//		}
		@RequestMapping("/")
		public Person firstMehod() {
			System.out.println(session);
			return Person.builder().name("유병승").age(19).addr("경기도 시흥시").build();
					
		}
		
	
}
