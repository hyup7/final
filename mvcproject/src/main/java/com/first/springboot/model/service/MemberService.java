package com.first.springboot.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.springboot.model.dao.MemberDao;
import com.first.springboot.model.mapper.MemberMapper;
import com.first.springboot.model.vo.Member;

@Service
public class MemberService {
//	@Autowired
//	SqlSession session;
	
	
	@Autowired 
	MemberMapper mapper;//SqlSession
	 	
	@Autowired
	SqlSession session;

	@Autowired
	MemberDao dao;
	
	public List<Member> selectListMember(){
		return dao.selectListMember(session);
	}
	
	
	public Member selectOneMember(String userId) {
		return dao.selectOneMember(mapper,userId);
	//	return null;
	}
	
	
}
