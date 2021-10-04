package com.kh.spring.member.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.spring.member.model.dao.MemberDao;
import com.kh.spring.member.model.vo.Member;
@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao dao;
	
	@Autowired
	private SqlSessionTemplate session;
	@Override
	public Member memberLogin(Member member) {		
		Member m=dao.memberLogin(session,member);
		return m;
	}
	@Override
	public Member selectUserId(String userId) {
		Member m=dao.selectUserId(session,userId);
		return m;
	}
	@Override
	public int enrollMember(Member m) {
		int result =dao.enrollMember(session,m);
		return result;
	}
}
