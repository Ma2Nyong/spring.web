package com.my.spring.web.ch02.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@GetMapping("11") // spring초기 때부터 있던 type, ModelAndView
	public ModelAndView handler11(ModelAndView mv) {
		mv.addObject("user", new User("최한석", 11)); // model
		mv.setViewName("ch02/ex01/user"); // view
		
		return mv;
	}
	
	@GetMapping("21") // 그다음이 return type 이 string인 경우.
	public String handler21(Model model) {
		model.addAttribute("user", new User("한아름", 21));
		return "ch02/ex01/user"; // Model만 있기에 view를 return한다.
	}
	
	@GetMapping("22")
	public String handler22() {
		return "ch02/ex01/user";
	}
	// dispath 한테 31이라는 viewname과 modelname 은 user를 return 하게 된다 
	@GetMapping("ch02/ex01/31") // viewname을 적지않으면 mapping url을 viewname으로 return한다.
	public void handler31(User user) {
		user.setUsername("양승일");
		user.setAge(31);
	}
	
	@GetMapping("ch02/ex01/32") //model name은 자동으로 나타나지만 수동으로 지정하고싶을경우
	public void handler32(@ModelAttribute("man") User user) { // ModelAttribute를 사용한다. 
		user.setUsername("서준한");
		user.setAge(32);
	}
	
	@GetMapping("ch02/ex01/41")
	public User handler41(User user) {
		user.setUsername("김가람");
		user.setAge(21);
		
		return user;
	}
	
	@GetMapping("ch02/ex01/42")
	@ModelAttribute("man")
	public User handler42(User user) {
		user.setUsername("박건우");
		user.setAge(41);
		
		return user;
	}
}
