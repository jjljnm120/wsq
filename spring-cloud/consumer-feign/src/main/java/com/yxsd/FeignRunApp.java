package com.yxsd;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class FeignRunApp {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(FeignRunApp.class, args);
	}

}
