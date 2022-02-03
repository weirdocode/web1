package com.spring.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.basic.model.BirthVO;

@Controller
public class BirthController {

	//생일을 입력하는 폼을 열어주는 메서드
	@GetMapping("/birth")
	public String birthForm() {
		return "birth/birth-form";
	}
	
	//생일 정보를 콘솔창에 출력하고, result 페이지에 전달하는 요청 메서드
	@PostMapping("/birth")
	public String sendBirth(@ModelAttribute("birth") BirthVO birth) {
		
		String birthDay = birth.getYear() + birth.getMonth() + birth.getDay();
		System.out.println("완성된 생년월일: " + birthDay);
		return "birth/birth-result";
	}
	
}




















