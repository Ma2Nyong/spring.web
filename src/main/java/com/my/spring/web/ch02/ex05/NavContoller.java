package com.my.spring.web.ch02.ex05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ch02/ex05")
public class NavContoller {
	@GetMapping("forward")
	public String forward() {
		return "forward:target"; //"target" container viewname으로 인식한다.
	} // forward:target은 ch02/ex05/target 인 request url로 인식한다.
	// forward handler에서 target handler로 이동한다.
	@GetMapping("target")
	public String target() {
		return "ch02/ex05/target"; // viewname 이다.
	}

	@GetMapping("redirect")
	public String redirect() {
		return "redirect:target"; // 단, response url로 인식한다.
	}
	// forward는 A와 B가 같은 서버내에 있을경우 가능하다.	
	@GetMapping("naver")
	public String naver() {
		return "redirect:http://www.naver.com";
	}
}
