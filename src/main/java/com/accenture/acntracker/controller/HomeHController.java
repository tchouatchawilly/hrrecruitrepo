package com.accenture.acntracker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeHController extends AbstractHController {
	
	@RequestMapping(value = "/acnhire", method = RequestMethod.GET)
	public String index() {
		return "hello";
	}
}
