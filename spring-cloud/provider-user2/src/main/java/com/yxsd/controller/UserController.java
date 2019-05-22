package com.yxsd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("hello/{name}")
	public String hello(@PathVariable String name) {
		
		return "provider2:"+name;
	}
}
