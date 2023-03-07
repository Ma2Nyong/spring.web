package com.my.spring.web.ch02.ex02;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02.ex02")
@RequestMapping("ch02/ex02") //Mapping 에 공통 mapping url을 준다.
public class UserController {
	@GetMapping("userIn") // ch02/ex02 부분은 domain을 나타내겠지?
	public String userIn() { // 그 뒤 userIn은 기능부분으로, ex) ADD, FIX 등등
		return "ch02/ex02/userIn";
	}
	/*
	@PostMapping("userOut") // write 작업.
	public String userOut(@RequestParam String username,
						@RequestParam int age,
						@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd")LocalDate regDate,
						Model model) {
		model.addAttribute("user", new User(username, age, regDate));
		return "ch02/ex02/userOut";
	}
	*/
	//ppt 만들때는 생략하고 써도된다, 허나 RequestParam이 생략된다는것을 기억하라.
	@PostMapping("userOut") // parameter가 다수일경우 domain으로 준비하는것이 좋다. ex03번 으로
	public String userOut(String username,
						int age,
						@DateTimeFormat(pattern="yyyy-MM-dd")LocalDate regDate,
						Model model) {
		model.addAttribute("user", new User(username, age, regDate));
		return "ch02/ex02/userOut";
	}
}
