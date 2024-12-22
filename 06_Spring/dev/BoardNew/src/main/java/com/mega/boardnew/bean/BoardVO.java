package com.mega.boardnew.bean;

import java.util.List;

import lombok.Data;

@Data
public class BoardVO {
	private Long bno;
	private String title;
	private String content;
	private String writer;
	private String regdate;
	private String updatedate;
	private List<AttachFileVO> attachList;
	// input tag의 name에
	// attachList[i].fileName
	// attachList[i].uuid
	// attachList[i].uploadPath
	// attachList[i].fileType
	// 방식으로 submit하면 자동으로 List에 add된다.
}
