package com.yxsd.service.fallback;

import org.springframework.stereotype.Component;

import com.yxsd.service.FeignService;

@Component
public class FeignFallback implements FeignService{

	@Override
	public String hello(String name) {
		// TODO Auto-generated method stub
		return "啥都没有";
	}

}
