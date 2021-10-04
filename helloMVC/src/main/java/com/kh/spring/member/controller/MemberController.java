package com.kh.spring.member.controller;

import java.net.http.HttpRequest;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring.member.model.service.MemberService;
import com.kh.spring.member.model.vo.Member;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	@RequestMapping("/main")
	public String main() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String memberLogin(Model model,HttpSession session,Member member,
			HttpServletRequest req,HttpServletResponse res) {
		
		String saveId=req.getParameter("saveId");
		System.out.println(saveId);
		if(saveId!=null) {
			Cookie c=new Cookie("saveId",member.getUserId());
			c.setMaxAge(60*60*24);
			res.addCookie(c);
		}else {
			Cookie c= new Cookie("saveId","");
			c.setMaxAge(0);
			res.addCookie(c);
		}
		Member m=service.memberLogin(member);
		String msg="";
		String loc="";
		if(m!=null){
			//로그인 성공
			session.setAttribute("memberlogin", m);
			msg="로그인 성공";
			loc="/main";
			model.addAttribute("msg",msg);
			model.addAttribute("loc",loc);
		}else {
			//로그인 실패
			msg="로그인 실패";
			loc="/main";
			model.addAttribute("msg",msg);
			model.addAttribute("loc",loc);
			
		}
		
		return "common/msg";	
	}
	@RequestMapping("/logout")
	public String memberlogout(HttpSession session) {
		session.invalidate();
		return "index";
	}
	@RequestMapping("/memberView")
	public String memberView(HttpServletRequest req,Model model) {
		String userId=req.getParameter("userId");
		Member m = service.selectUserId(userId);
		System.out.println(m);
		model.addAttribute("m",m);
		return "member/memberView";
	}
	@RequestMapping("/memberEnrollEnd")
	public String enrollMemberEnd(Member m) {
		System.out.println(m);
		int result =service.enrollMember(m);
		System.out.println(result);
		return "index";
	}
	
	@RequestMapping("/enrollMember")	
	public String enrollMember() {
		return "member/memberEnroll";
	}
}
