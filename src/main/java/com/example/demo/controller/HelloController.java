package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Person;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class HelloController {
	private static final Logger log = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping("/test1")
	public ModelAndView test() {
		System.out.println("(((((");
		System.out.println("jfsdkls");
		System.out.println("(((((");
		System.out.println("(((((");
		System.out.println("(((((");

		Person user = new Person();
		user.setName("tom");
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		mv.setViewName("/show.html");
		log.trace("trace 1234");
		log.debug("debug 1234");
		log.info("info 1234");
		log.warn("warn 1234");
		log.error("error 1234");
		return mv;
	}

	@Autowired
	UserService userService;
	
	@RequestMapping("/getUser")
	public User getUser(Long id) {
		return userService.getUser(id);
	}
}
