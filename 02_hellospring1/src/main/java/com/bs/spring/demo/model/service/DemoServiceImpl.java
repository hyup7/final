package com.bs.spring.demo.model.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.spring.demo.model.dao.DemoDao;
import com.bs.spring.demo.model.vo.Dev;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoDao dao;
	
	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public int insertDemo(Dev dev) {
		// TODO Auto-generated method stub
		int result=dao.insertDemo(session,dev);
		
		return result;
	}

	@Override
	public List<Dev> selectDevList() {
		// TODO Auto-generated method stub
		return dao.selectDevList(session);
	}
	
	
	

}
