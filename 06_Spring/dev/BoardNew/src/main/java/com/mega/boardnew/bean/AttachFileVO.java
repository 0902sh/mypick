package com.mega.boardnew.bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class AttachFileVO {
	private String fileName;
	private String uploadPath;
	private String uuid;
	private boolean image;
	private Long bno;
}
