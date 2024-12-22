package com.mega.boardnew.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mega.boardnew.bean.BoardVO;
import com.mega.boardnew.util.Color;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class BoardMapperTest {
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		// Lambda 문법
		mapper.getList()
		      .forEach(board -> log.info(Color.MAGENTA + board + Color.END));
	}
	
	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("테스트에서 작성");
		board.setContent("테스트에서 작성한 것 맞습니다.");
		board.setWriter("슈퍼관리자");
		
		int result = mapper.insert(board);
		log.info(Color.GREEN + result + "건 insert 성공" + Color.END);
		board.setTitle("셀렉트를 먼저 함");
		result = mapper.insertSelectKey(board);
		log.info(Color.GREEN + result + "건 insert 성공" + Color.END);
	}
	
	@Test
	public void testRead() {
		BoardVO board = mapper.read(2L);
		
		log.info(Color.RED + board + Color.END);  // board.toString()
	}
	
	@Test
	public void testDelete() {
		Long bno = 8L;
		int result = mapper.delete(bno);
		if(result == 0) {
			log.info("delete할 대상이 없습니다.");
		}
		else {
			log.info(result + "건 delete 성공");
		}
	}
	
	@Test
	public void testUpdate() {
		Long bno = 7L;
		BoardVO board = new BoardVO();
		board.setBno(bno);
		board.setTitle("수정한 거에요");
		board.setContent("진짜 수정한 것 맞습니다.");
		board.setWriter("걸리버여행기");
		
		int result = mapper.update(board);
		if(result == 0) {
			log.info("update할 대상이 없습니다.");
		}
		else {
			log.info(result + "건 update 성공");
		}
	}
}
