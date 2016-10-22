package com.bep.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableAutoConfiguration
//@Configuration
@ComponentScan({"com.bep.startup.controller"})
@Controller
public class BepStartupWebApplication {
	
	@RequestMapping("/") 
	@ResponseBody
	public String index() {
		return "Teste";
	}

	public static void main(String[] args) {
		SpringApplication.run(BepStartupWebApplication.class, args);
	}

}
