package com.mega.boardnew.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mega.boardnew.util.Color;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class TimeMapperTest {
	@Autowired
	private TimeMapper mapper;
	
	@Test
	public void testGetTime() {
		log.info("------------------------------------------------------");
		log.info(Color.BLUE + "Annotation : " + mapper.getTime() + Color.END);
		log.info(Color.BLUE + "XML LINK : " + mapper.getTimeUsingXML() + Color.END);
		log.info("------------------------------------------------------");
	}
	
}
