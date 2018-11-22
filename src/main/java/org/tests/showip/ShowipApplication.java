package org.tests.showip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ShowipApplication {

	public static void main(String args[]) {
		SpringApplication.run(ShowipApplication.class, args);
	}
}
