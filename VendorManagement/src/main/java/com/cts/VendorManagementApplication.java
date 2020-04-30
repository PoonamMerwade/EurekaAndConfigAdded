package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cts"})
@EnableEurekaClient
public class VendorManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendorManagementApplication.class, args);
	}

}

//(exclude = {DataSourceAutoConfiguration.class })

