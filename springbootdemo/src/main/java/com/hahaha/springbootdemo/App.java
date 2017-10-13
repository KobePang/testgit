package com.hahaha.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */

@RestController
@EnableAutoConfiguration
public class App 
{
	@RequestMapping("/hey")
	public String test() {
		return "this is my first spring-boot!";
	}
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
