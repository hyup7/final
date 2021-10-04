package com.first.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.first.springboot.model.service.MemberService;

@Controller
public class MvcController {
	
	
	@Autowired
	MemberService service;
	@RequestMapping("/")
	public String main() {
		return "index";
	}
	
	@RequestMapping("/member/selectOne")
	public ModelAndView selectOneMember(String userId,ModelAndView mv) {
		mv.addObject("m",service.selectOneMember(userId));
		mv.setViewName("result");
		return mv;
	}
	@RequestMapping("/member/selectList")
	public ModelAndView selectListMember(ModelAndView mv) {
		mv.addObject("m",service.selectListMember());
		mv.setViewName("result");
		return mv;
	}
}
