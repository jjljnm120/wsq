package com.yxsd.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "provider-user")
public interface FeignService {

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name")String name);
}
