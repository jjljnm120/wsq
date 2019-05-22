package com.yxsd.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yxsd.service.FeignService;


@RestController
public class HelloController {

	@Autowired
	private FeignService feignService;


	@GetMapping("/hello/{name}")
	@ResponseBody
	public String hello(@PathVariable String name) {
		return feignService.hello(name);
	}

}
