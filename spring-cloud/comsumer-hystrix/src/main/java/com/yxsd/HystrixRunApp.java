package com.yxsd;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringCloudApplication
@EnableFeignClients		//开启feign
@EnableCircuitBreaker	//开启hystrix
@EnableHystrixDashboard
public class HystrixRunApp {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HystrixRunApp.class, args);
	}

}
