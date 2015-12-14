package zb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/")
public class HelloMVC {

	@RequestMapping("/home")
	public String helloMvc() {
		return "home";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}
