package com.mega.boardnew.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mega.boardnew.mapper.AttachFileMapper;
import com.mega.boardnew.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Repository  // @Component의 자식 annotation으로 DAO에 사용
@RequiredArgsConstructor
@Slf4j
public class BoardDAO {
	@Autowired
	private BoardMapper mapper;
	
	@Autowired
	private AttachFileMapper fmapper;
	
	// 전체 게시글 가져오기
	public List<BoardVO> getList(){
		return mapper.getList();
	}
	
	public List<BoardVO> getListWithKey(String type, String keyword){
		return mapper.getListWithKey(type, keyword);
	}
	
	// 게시글 입력
	public void register(BoardVO board) {
		mapper.insertSelectKey(board);
		
		if(board.getAttachList() == null || board.getAttachList().size() == 0){
			return;
		}
		else {
			board.getAttachList().forEach(attach -> {
				attach.setBno(board.getBno());
				fmapper.insert(attach);
			});
		}
	}
	
	// 게시글 읽기
	public BoardVO get(Long bno) {
		return mapper.read(bno);
	}
	
	// 게시글 삭제
	public boolean remove(Long bno) {
		// 삭제를 성공하면 true, 실패하면 false를 리턴하도록 구현하시오.
//		if(mapper.delete(bno) == 1) {
//			return true;
//		}
//		else {
//			return false;
//		}
		
		return mapper.delete(bno) == 1;
	}
	
	// 게시글 수정
	public boolean modify(BoardVO board) {
		return mapper.update(board) == 1;
	}
	
	public List<AttachFileVO> getAttachList(Long bno){
		return fmapper.findByBno(bno);
	}
}
