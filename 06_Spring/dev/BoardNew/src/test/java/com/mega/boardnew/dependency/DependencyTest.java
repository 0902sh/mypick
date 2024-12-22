package com.mega.boardnew.dependency;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mega.boardnew.util.Color;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class DependencyTest {
	@Autowired
	Coding coding;
	
	@Autowired
	Color color;
	
	@BeforeAll
	public static void initTest() {
		log.info(Color.BOLD + "테스트가 시작됩니다. 대피하세요." + Color.END);
	}
	
	@BeforeEach
	public void initTest2() {
		log.info(Color.BOLD + "테스트가 시작됩니다. 이번엔 진짜" + Color.END);
	}
	
	@Test
	public void testSample() {
		log.info("testSample logging...");
	}
	
	@Test
	public void testSample2() {
		log.info(Color.BLUE + Color.BOLD + "testSample2 logging" + Color.END);
	}
	
	@Test
	public void testCoding() {
		
		log.info("" + coding.toString());
	}
}
