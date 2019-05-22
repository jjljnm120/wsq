package com.yxsd.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yxsd.client.FeignService;

@RestController
public class HelloController {

	@Autowired
	private FeignService feignService;
	
	@GetMapping("/hello/{name}")
	@ResponseBody
	@HystrixCommand(fallbackMethod = "helloFallback")
	public String hello(@PathVariable("name")String name) {
		return feignService.hello(name);
	}
	
	public String helloFallback(String name) {
		return "tonny";
	}
}
