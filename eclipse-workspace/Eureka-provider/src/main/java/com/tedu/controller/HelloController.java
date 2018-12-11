package com.tedu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class HelloController {

	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "1:"+name;
	}
}
