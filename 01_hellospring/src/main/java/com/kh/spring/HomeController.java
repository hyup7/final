package com.kh.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kh.spring.animal.Animal;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	//등록된 bean을 변수에 대입하라는 설정
	//@Autowried <-일치하는 타입의 등록된 bean을 대입하라!
	@Autowired
	private Fruit f;
	
	@Autowired
	@Qualifier("emp")
	private Employee e;
	
	@Autowired
	@Qualifier("emp1")
	private Employee e1;
	
	@Autowired(required = false)
	private Animal ani;
	
	@Autowired
	@Qualifier("p2")
	private Person p;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model,HttpSession session,
			HttpServletRequest req,HttpServletResponse res) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		
		System.out.println("사과 : "+f);
		f.setPrice(10000);
		System.out.println("사과 : "+f);
		System.out.println("사원 : "+e);
		System.out.println("동물 : "+ani);
		System.out.println("사람 : "+p);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		session.setAttribute("userId", "admin");
		
		Cookie c=new Cookie("time","마지막시간이네요!");
		c.setMaxAge(60*60*24);
		res.addCookie(c);
		
		return "index";
	}
	
}
