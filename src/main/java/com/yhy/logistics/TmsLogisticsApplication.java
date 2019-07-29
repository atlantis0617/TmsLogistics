package com.yhy.logistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ServletComponentScan("com.yhy.logistics")
@EnableJpaRepositories
public class TmsLogisticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmsLogisticsApplication.class, args);
	}
}
