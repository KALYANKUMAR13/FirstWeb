package io.start.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hello kalyankumar v";
	}
}
