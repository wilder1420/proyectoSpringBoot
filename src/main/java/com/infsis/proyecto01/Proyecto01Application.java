package com.infsis.proyecto01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Proyecto01Application {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto01Application.class, args);
	}

}
