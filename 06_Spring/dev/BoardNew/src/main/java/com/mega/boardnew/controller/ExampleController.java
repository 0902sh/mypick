package com.mega.boardnew.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mega.boardnew.bean.ArtVO;
import com.mega.boardnew.bean.SubjectVO;
import com.mega.boardnew.mapper.TimeMapper;
import com.mega.boardnew.util.Color;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/ex/*")  // localhost:10000/ex는 제 껍니다.
public class ExampleController {
	@Autowired
	private TimeMapper mapper;
	
	@GetMapping("")
	public void nothing() {
		log.info("nothing method is called");
	}
	
	@RequestMapping(value="sports", method= {RequestMethod.GET})
//	public void getSports() {  // void의 경우 RequestMapping의 이름.html
	public String getSports() {
		log.info(Color.BLUE + "My favorite sports is the golf" + Color.END);
		return "ex/mysports";
	}
	
	@RequestMapping(value="sports", method= {RequestMethod.POST})
	public String postSports() {
		log.info(Color.BLUE + "My favorite sports is the soccer" + Color.END);
		return "ex/mysports";
	}
	
	// classic way
	// localhost:10000/ex/classic?title=nocturn&artist=Chopin
	@GetMapping("classic")
	public String classicTest(HttpServletRequest req) {
		String title = req.getParameter("title");
		String artist = req.getParameter("artist");
		log.info("classic : " + title + ":" + artist);
		return "/index";
	}
	
	@GetMapping("modern")
	public String modernTest(String title, String artist, String desc) {
		log.info("modern : " + title + ":" + artist);
		return "/index";
	}
	
	@GetMapping("future")
	public String futureTest(ArtVO artVO, String title) {
		log.info("future : " + artVO);
		log.info("future : " + title);
		return "/index";
	}
	
	// http://localhost:10000/ex/order?m=steak&a=10000로 입력
	@GetMapping("order")
	public String getOrder(@RequestParam("m") String menu, 
			               @RequestParam("a") int amount) {
		log.info("--------------------------------------");
		log.info("menu : " + menu + " : amount : " + amount);
		log.info("--------------------------------------");
		return "/index";
	}
	
	// java에서 html로 데이터 전송하기 : Model 활용
	@GetMapping("query")
	public void query(@ModelAttribute("MyModel") ArtVO vo) {
		vo.setTitle("Piano Concerto NO.1");
		vo.setArtist("차이코프스키");
		vo.setDesc("그냥 들어");
//		vo.setDesc(mapper.getTime());
	}
	
	@GetMapping("subject")
	public void subject() {
		
	}
	
	@GetMapping("subjectvo")
	public String subjectVO(SubjectVO vo, Model model) {
		model.addAttribute("subject", vo);
		model.addAttribute("feeling", "매우 화남");
		
		return "/ex/subjectTest";
	}
}
