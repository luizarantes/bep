/**
*
* Copyright BEP STARTUP 2016 All Rights Reserved. 
* No part of this Portal may be reproduced without GSI express consent.
* 
*/
package com.bep.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
//@Configuration
//@EnableJpaRepositories("com.bep.startup.data.repository")
//@EntityScan("com.bep.startup.model.domain")
//@ComponentScan({"com.bep.startup.service.impl"})

/** 
*
* @author Luiz Arantes
* @since 1.0
* 
*/
public class BepStartupCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BepStartupCoreApplication.class, args);
	}

}

