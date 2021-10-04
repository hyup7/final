package com.kh.spring.member.model.service;

import org.mybatis.spring.SqlSessionTemplate;

import com.kh.spring.member.model.vo.Member;

public interface MemberService {

	Member memberLogin(Member member);
	Member selectUserId(String userId);
	int enrollMember(Member m);
	
}
