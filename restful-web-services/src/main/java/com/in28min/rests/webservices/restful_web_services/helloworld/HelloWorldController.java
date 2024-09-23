package com.in28min.rests.webservices.restful_web_services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloworld() {
		return "Hello World!";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean HelloWorldBean() {
		return new HelloWorldBean("Hello World !");
	}

	@GetMapping("/hello-world/path-variable/{name}")
	public HelloWorldBean HelloWorldPathVariable(@PathVariable String name){
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}

}