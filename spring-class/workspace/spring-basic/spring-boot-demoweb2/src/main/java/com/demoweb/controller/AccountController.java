package com.demoweb.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demoweb.entity.MemberEntity;
import com.demoweb.service.AccountService;

@Controller
@RequestMapping(value = "/account/")
public class AccountController {
	
	@Autowired
	@Qualifier("accountService")
	private AccountService accountService;
	
	//@RequestMapping(value = "/register.action", method = RequestMethod.GET)
	@GetMapping(value = "/register.action")
	public String showRegisterForm() {
		return "account/register";
	}
	
	//@RequestMapping(value = "/register.action", method = RequestMethod.POST)
	@PostMapping(value = "/register.action")
	public String register(MemberEntity member) {
		
		accountService.registerMemberTx(member);
		
		return "redirect:login.action";
	}

	@GetMapping(value = "/login.action")
	public String showLoginForm() {
		return "account/login"; // -> /WEB-INF/views/account/login.jsp
	}
	
	@PostMapping(value = "/login.action")
	public String login(MemberEntity member, HttpSession session) {
				
		MemberEntity member2 = accountService.findMemberByIdAndPasswd(member);
		
		if (member2 != null) { //로그인 가능한 사용자라면 (DB에 사용자 정보가 존재한다면)				
			//로그인 처리 (세션과 같은 상태 유지 객체에 로그인 데이터 저장)
			session.setAttribute("loginuser", member2); // Session에 데이터 저장
			
			//2. 이동 (forward : to .jsp, redirect : to servlet)
			return "redirect:/home.action";
			
		} else { //로그인 실패
			return "account/login";  // -> /WEB-INF/views/ + account/login + .jsp
		}
	}
	
	@RequestMapping(value = "/logout.action", method = RequestMethod.GET)
	public String logout(MemberEntity member, HttpSession session) {
		session.removeAttribute("loginuser");
		return "redirect:/home.action";
	}
	
}







