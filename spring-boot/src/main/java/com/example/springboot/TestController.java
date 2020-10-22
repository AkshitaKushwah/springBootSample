package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/hello")
	public String hello() {
		return "<h2> Spring Boot + Jenkinns!!! </h2>";
	}
}
