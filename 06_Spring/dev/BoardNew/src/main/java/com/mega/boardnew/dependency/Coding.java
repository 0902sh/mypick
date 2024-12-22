package com.mega.boardnew.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Component
@Data
@Slf4j
public class Coding {
	@Autowired
	private Computer computer;
	
	Coding(){
		log.info("Coding Created...");
	}
}
