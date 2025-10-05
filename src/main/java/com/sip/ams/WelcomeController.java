package com.sip.ams;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
	@ResponseBody
	public String info()
	{
		return"<h1>Hello Spring</h1>";
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String display()
	{
		return"<h1>Hello Hello</h1>";
	}

}
