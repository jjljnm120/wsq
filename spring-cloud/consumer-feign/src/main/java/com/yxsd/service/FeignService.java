package com.yxsd.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.yxsd.service.fallback.FeignFallback;

@FeignClient(value = "provider-user", fallback = FeignFallback.class)
public interface FeignService {

	String hello(String name);

}
