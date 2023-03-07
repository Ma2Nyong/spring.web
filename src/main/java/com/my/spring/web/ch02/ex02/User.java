package com.my.spring.web.ch02.ex02;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor // field 부터 작성하고 생성자를 지정하라.
public class User {
	private String username;
	private int age;
	private LocalDate regDate;
}
