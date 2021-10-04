package com.first.springboot.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.first.springboot.model.vo.Member;

@Mapper
public interface MemberMapper {

	
	//매소도로 SQL문을 작성을 함.
	@Select("select * from member where userid=#{userid}")
//	@Results(value= {@Result(column = "",property = ""),})
	public Member selectOneMember(String userId);
	
	
}
