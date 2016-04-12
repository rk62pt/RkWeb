package com.rk62pt.home.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	//private final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index() {
		//logger.info("index() is executed!");
//		System.out.println("index() is executed!");
		return "index.html";
	}
}
