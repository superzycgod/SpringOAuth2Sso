package cn.zycgod.oauth2.client.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Value("${server.port}")
	private Integer port;
	
	@RequestMapping("/home")
	public Object home(Principal principal) {
		return principal.getName() + " login success, in server port " +  port;
	}
}
