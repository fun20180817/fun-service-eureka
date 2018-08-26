/**
 * Company:	F-space
 * Project Name:fun-service-eureka 
 * File Name:EurekaApplication.java 
 * Package Name:com.fun 
 * Date:2018年8月20日下午5:25:32 
 * Copyright (C) 2016,F-space. All rights reserved.
 * 
 */
package com.fun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/** 
 * ClassName: EurekaApplication <br/> 
 * Function: server starter. <br/> 
 * date: 2018年8月20日 下午5:25:32 <br/> 
 * 
 * @author lishuai11 
 * @version  
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

}
