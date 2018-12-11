package com.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tedu.client.EurekaServiceFeign;

@RestController
public class HelloControler {
	
	@Autowired
	private EurekaServiceFeign eurekaServiceFeign;
	
	@RequestMapping("/hello/{name}")
	@HystrixCommand(fallbackMethod="helloFallback")
	public String hello(@PathVariable String name) {
		return eurekaServiceFeign.hello(name);
	}
	
	public String helloFallback(String name){
		return "fail i was wrong !";	//失败调用时，返回默认值
	}
}
