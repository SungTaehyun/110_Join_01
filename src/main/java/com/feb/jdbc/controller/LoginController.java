package com.feb.jdbc.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	//// http://localhost:8080/spring/loginPage.do
	/**
	 * 
	 * @return
	 */
	@GetMapping("/loginPage.do")
	public ModelAndView loginPage() {
		// ModelAndView 객체 생성
		ModelAndView mv = new ModelAndView();
		// 뷰의 이름을 "login"으로 설정
		mv.setViewName("login");
		// 설정된 ModelAndView 객체 반환
		return mv;
	}

}
