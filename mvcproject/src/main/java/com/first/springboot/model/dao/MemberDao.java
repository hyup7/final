package com.first.springboot.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.first.springboot.model.mapper.MemberMapper;
import com.first.springboot.model.vo.Member;

@Repository
public class MemberDao {

	public Member selectOneMember(MemberMapper mapper,String userId) {
		return mapper.selectOneMember(userId);
		
	}

	public List<Member> selectListMember(SqlSession session){
		return session.selectList("member.selectListMember");
	}

}
