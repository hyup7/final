package com.kh.spring.animal;

import org.springframework.stereotype.Component;

import lombok.Data;
//4가지 방법 - >클래스선언부 위에 작성
//1.@Component:기본 스프링 빈
//2.@Controller : mvc패턴에서 controller기능을 하는 클래스 -> RequestMapping();
//3.@Service: mvc패턴에서 service기능하는 클래스
//4.@Repository : mvc패턴에서 Repository기능을 하는 클래스
@Component
@Data
public class Animal {
	private String name;
	private int age;
	
}
