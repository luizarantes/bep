/**
*
* Copyright BEP STARTUP 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/** 
*
* @author GSI
* @since 1.0
* 
*/
@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.bep.startup.data.repository")
@EntityScan("com.bep.startup.model.domain")
@ComponentScan({"com.bep.startup.service.impl"})
@ComponentScan({"com.bep.startup.controller"})
public class BepStartupWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BepStartupWebApplication.class, args);
	}

}
