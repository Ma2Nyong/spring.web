package com.my.spring.web.ch02.ex06;

import lombok.Data;

@Data
public class UserDto { // data transform object? , 그저 paramter로 쓸것이다.
	private String username;
	private String password;
}
