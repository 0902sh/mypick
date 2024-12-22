package com.mega.boardnew.dependency;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Component
@Data
@Slf4j
public class Computer {
	private String name;
	private String brand;
	
	Computer() {
		log.info("Computer Created...");
		name = "조립";
		brand = "용산";
	}
}
