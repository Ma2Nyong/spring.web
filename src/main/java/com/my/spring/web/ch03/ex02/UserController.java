package com.my.spring.web.ch03.ex02;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller("ch03.ex02")
@RequestMapping("ch03/ex02/user")
public class UserController {
	@Value("${attachPath") private String attachPath;
	
	@GetMapping
	public String userIn() {
		return "ch03/ex02/userIn";
	}
	
	@PostMapping
	public String userOut(UserDto userDto, User user) {
		// 첨부 파일의 이름을 가져옵니다.
		String filename = userDto.getFace().getOriginalFilename();
		// 첨부 파일을 저장합니다.
		saveFile(attachPath + "/" + filename, userDto.getFace());
		// 유저 객체에 얼굴 이미지 파일 이름을 저장합니다.
		user.setFaceFilename(filename);
		// "ch03/ex02/userOut" 뷰를 반환합니다.
		return "ch03/ex02/userOut";
	}
	
	// 파일을 저장하는 메소드
	private void saveFile(String filename, MultipartFile file) {
		try {
			// 첨부 파일을 지정된 파일 이름으로 저장합니다.
			file.transferTo(new File(filename));
		} catch(IOException e) {}
	}
}
