package com.my.spring.web.ch02.ex01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // lombok 에서 getter와 setter를 만들어준다
@NoArgsConstructor // parameter가 없는 기본생성자.
@AllArgsConstructor
public class User {
	private String username;
	private int age;
}
// 만약 lombok이 제대로 작동 안할때, 상단의 project -> clean... 누르기