package com.mega.boardnew.bean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class BoardDAOTest {
	@Autowired
	private BoardDAO dao;
	
	@Test
	public void testRemove() {
		Long bno = 3L;
		if(dao.remove(bno)) {
			log.info("글번호 " + bno + "삭제 성공");
		}
		else {
			log.info("글번호나 좀 확인하고 지워요");
		}
	}
	
	
}
