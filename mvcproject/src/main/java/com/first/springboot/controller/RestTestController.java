package com.first.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.first.springboot.model.service.MemberService;
import com.first.springboot.model.vo.Member;

@RestController
public class RestTestController {

	@Autowired
	private MemberService service;
	
	@GetMapping("/member")
	public List<Member> selectMemberAll(){
		return service.selectListMember();
	}
	@GetMapping("/member/{userId}")
	public Member selectMemberOne(@PathVariable(value="userId") String userId) {
		return service.selectOneMember(userId);
	}
}
