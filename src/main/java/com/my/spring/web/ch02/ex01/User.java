package com.my.spring.web.ch02.ex01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // lombok 에서 getter와 setter를 만들어준다
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private String username;
	private int age;
}
