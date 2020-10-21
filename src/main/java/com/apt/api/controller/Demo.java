package com.apt.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value="/Level1")

public class Demo {
	@GetMapping(value = "/data")
	public String getDemodata() {
		return "Demo Data from intelliJ";
	}
}
