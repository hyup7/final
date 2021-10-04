package com.kh.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ContextTest2 {		
		//bean을 설정할 수 있는 객체
		//@Bean어노테션이 선언된 메소드를 선언 -> 메소드는 등록할 Bean크ㅜㄹ래스를 반환
		@Bean
		@Qualifier("p2")
		public Person getEmp() {
			return new Person();
		}
}
