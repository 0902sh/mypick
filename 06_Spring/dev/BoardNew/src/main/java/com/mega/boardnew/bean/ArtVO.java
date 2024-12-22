package com.mega.boardnew.bean;

import lombok.Data;

@Data
public class ArtVO {
	String title;
	String artist;
	String desc;
	
	public void setTitle(String title) {
		System.out.println("누가 감히 여길 세팅하고 있지?");
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
		// return "감히 제목을 조회하려고???";
	}
}
