package com.kh.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//BeanConfigration기능을 하는 클래스를 만들 수 있음
@Configuration
public class ContextTest {
	
	//bean을 설정할 수 있는 객체
	//@Bean어노테션이 선언된 메소드를 선언 -> 메소드는 등록할 Bean크ㅜㄹ래스를 반환
	@Bean
	@Qualifier("p2")
	public Person getEmp() {
		return new Person();
	}
	@Bean
	@Qualifier("p1")
	public Person getEmp2() {
		Person p=new Person();
		p.setName("장우영");
		p.setAge(28);
		p.setAddr("서울");
		return p;
	}
}
