package com.my.spring.web.ch02.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@GetMapping("11")
	public ModelAndView handler11(ModelAndView mv) {
		mv.addObject("user", new User("최한석", 11)); // model
		mv.setViewName("ch02/ex01/user"); // view
		
		return mv;
	}
	
	@GetMapping("21")
	public String handler21(Model model) {
		model.addAttribute("user", new User("한아름", 21));
		return "ch02/ex01/user"; // Model만 있기에 view를 return한다.
	}
	
	@GetMapping("22")
	public String handler22() {
		return "ch02/ex01/user";
	}
}
