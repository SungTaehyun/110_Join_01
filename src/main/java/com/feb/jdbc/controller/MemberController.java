package com.feb.jdbc.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.feb.jdbc.service.MemberService;

import java.util.HashMap; // HashMap 클래스를 가져옵니다.

import javax.servlet.http.HttpServletResponse; // HttpServletResponse 클래스를 가져옵니다.

import org.springframework.beans.factory.annotation.Autowired; // Autowired 애너테이션을 가져옵니다.
import org.springframework.stereotype.Controller; // Controller 애너테이션을 가져옵니다.
import org.springframework.web.bind.annotation.PostMapping; // PostMapping 애너테이션을 가져옵니다.
import org.springframework.web.bind.annotation.RequestParam; // RequestParam 애너테이션을 가져옵니다.
import org.springframework.web.servlet.ModelAndView; // ModelAndView 클래스를 가져옵니다.

import com.feb.jdbc.service.MemberService; // com.feb.jdbc.service 패키지에서 MemberService 클래스를 가져옵니다.

@Controller
public class MemberController {

    @Autowired // MemberService의 자동 의존성 주입
    private MemberService memberService; 

    /**
     * 회원가입 요청(/join.do) 컨트롤러
     * 
     * @param params 회원가입 정보
     * @return ModelAndView login.jsp 이동
     */
    @PostMapping("/join.do") // HTTP POST 요청을 /join.do로 매핑하기 위한 애너테이션입니다.
    public ModelAndView join(@RequestParam HashMap<String, String> params) {  // params라는 이름의 HashMap<String, String> 타입의 매개변수를 받는다.
    	// 이 매개변수는 회원가입 정보를 담고 있는 파라미터들을 받아온다.
    	// @RequestParam 애너테이션은 HTTP 요청 파라미터를 메서드의 매개변수에 바인딩하는데 사용
        ModelAndView mv = new ModelAndView(); // 새로운 ModelAndView 객체를 생성(ModelAndView는 컨트롤러가 처리한 결과를 담고 있는 객체)
        int result = memberService.join(params); //memberservice의 join 메서드를 호출하여 params라는 이름의 매개변수를 들고와서 회원등록을 시도
        
        //int result는 memberService.join(params) 메서드의 반환값을 저장하기 위한 변수
        
        mv.setViewName("login"); // 메서드가 처리한 결과를 보여줄 뷰의 이름을 나타냄(즉, 회원가입 성공하든 실패하든 로그인 페이지로 이동하게 설정한 것.)

        // 회원 등록 결과에 따른 메시지 추가
//        성공 시: 1
//        실패 시: 0 또는 음수
        if (result == 1) {
            mv.addObject("resultMsg", "회원가입 성공"); // 회원 등록이 성공한 경우
        } else {
            mv.addObject("resultMsg", "회원가입 실패"); // 회원 등록이 실패한 경우
        }
        return mv; // ModelAndView 객체를 반환합니다.
    }
}

