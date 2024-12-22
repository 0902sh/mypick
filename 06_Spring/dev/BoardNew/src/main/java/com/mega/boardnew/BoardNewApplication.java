package com.mega.boardnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(exclude= {DataSourceAutoConfiguration.class})
public class BoardNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardNewApplication.class, args);
	}

}
