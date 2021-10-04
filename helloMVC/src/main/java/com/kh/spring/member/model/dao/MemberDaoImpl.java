package com.kh.spring.member.model.dao;

import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring.member.model.vo.Member;

@Repository
public class MemberDaoImpl implements MemberDao{
	@Override
	public Member memberLogin(SqlSessionTemplate session,Member member) {
		return session.selectOne("member.memberLogin",member);
	}

	@Override
	public Member selectUserId(SqlSessionTemplate session, String userId) {
		return session.selectOne("member.selectUserId",userId);
	}

	@Override
	public int enrollMember(SqlSessionTemplate session, Member m) {
		
		return session.insert("member.enrollMember",m);
	}
	
}
