package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kkd927
 * @since 2017. 12. 29.
 */
@Controller
public class GreetingController {

	@RequestMapping("/greeting")
	public String greeting() {
		return "index";
	}

}
