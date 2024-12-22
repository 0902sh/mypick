package com.mega.boardnew.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.mega.boardnew.bean.AttachFileVO;
import com.mega.boardnew.bean.BoardDAO;
import com.mega.boardnew.bean.BoardVO;
import com.mega.boardnew.util.Color;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/board/*")
@Slf4j
public class BoardController {
	
	@Autowired
	private BoardDAO dao;
	
	@GetMapping("list")
	public void list(String type, String keyword, Model model) {
		log.info("----------------------------------");
		log.info("[BoardController] list called : " + keyword);
		log.info("----------------------------------");
		if(keyword == null) {
			dao.getList().forEach(board -> log.info(board.toString()));
			model.addAttribute("list", dao.getList());
		}
		else {
			model.addAttribute("list", dao.getListWithKey(type, keyword));
		}
	}
	
	@GetMapping("write")
	public void write() {
		
	}
	
	@PostMapping("write")
	// 글을 쓰고, 리스트 화면으로 이동하십시오.
	public RedirectView register(BoardVO board, RedirectAttributes rttr) { 
		if(board != null) {
			log.info("Register : " + board);
			dao.register(board);
			log.info("Register : " + board);
			rttr.addFlashAttribute("msg", board.getBno() + "번 글이 등록되었냐?");
		}
		
		return new RedirectView("list");
	}
	
	// localhost:10000/board/get?bno=N을 호출했을 때 내용을 보여주는 페이지
	// 리스트로 돌아가기 링크 클릭시 리스트로 이동
	// 1. 해당 주소 클릭 시 실행할 메서드 생성
	// 2. 메서드 호출 시 정상적인 호출이 되었는지를 확인하기 위해
	//    메서드 호출 정상 메시지 출력 기능 추가
	// 3. 매퍼로부터 bno에 해당하는 BoardVO 얻어오기
	// 4. model에 얻어온 BoardVO 넣기
	// 5. 페이지로 이동하기
	@GetMapping("get")
	public void get(Long bno, Model model) {
		log.info(Color.BOLD + Color.GREEN + "get called" + Color.END);
		BoardVO board = dao.get(bno);
//		model.addAttribute("board", board);
		if(board != null) {
			model.addAttribute("board", dao.get(bno));
		}
	}
	
	// localhost:10000/board/remove?bno=N
	// 해당 글의 삭제 처리 수행 후 리스트로 돌아감
	// 리스트로 이동하면 삭제 성공 시 삭제처리되었습니다. 삭제 실패 시 삭제에 실패하였습니다 메시지 출력
	@GetMapping("remove")
	public RedirectView remove(Long bno, RedirectAttributes rttr) {
		if(dao.remove(bno)) {
			rttr.addFlashAttribute("msg", "글 삭제에 성공하였습니다.");
		}
		else {
			rttr.addFlashAttribute("msg", "너 지금 뭐지운거냐?");
		}
		return new RedirectView("list");
	}
	
	@GetMapping("modify")
	public void modify(Long bno, Model model) {
		model.addAttribute("board", dao.get(bno));
	}
	
	@PostMapping("modify")
	public RedirectView modify(BoardVO board, RedirectAttributes rttr) {
		if(dao.modify(board)) {
			rttr.addFlashAttribute("msg", "업데이트에 성공하였습니다.");
		}
		else {
			rttr.addFlashAttribute("msg", "업데이트에 실패하였습니다.");
		}
		
		return new RedirectView("list");
	}
	
	// 게시글 첨부파일
	@GetMapping(value="/getAttachList", produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<AttachFileVO> getAttachList(Long bno){
		log.info("getAttachList---------> " + bno);
		return dao.getAttachList(bno);
	}
}