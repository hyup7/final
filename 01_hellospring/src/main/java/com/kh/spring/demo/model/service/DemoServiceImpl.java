package com.kh.spring.demo.model.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.spring.demo.model.dao.DemoDao;
import com.kh.spring.demo.model.vo.Dev;

@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	private DemoDao dao;
	@Autowired
	private SqlSessionTemplate session;
	
	public int insertDemo(Dev dev) {
		// TODO Auto-generated method stub
		int result=dao.insertDemo(session, dev);
		return result;
	}
	
	public List<Dev> selectDemoList(){
		List<Dev> list=dao.selectDemoList(session);
		return list;
	}

}
