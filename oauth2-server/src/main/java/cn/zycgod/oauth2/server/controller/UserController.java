package cn.zycgod.oauth2.server.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/me")
	public Object me(Principal principal) {
		return principal;
	}
	
}
