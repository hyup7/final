package com.kh.spring.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.kh.spring.member.model.vo.Member;

public interface MemberDao {
	Member memberLogin(SqlSessionTemplate session, Member member);

	Member selectUserId(SqlSessionTemplate session, String userId);

	int enrollMember(SqlSessionTemplate session, Member m);
}
