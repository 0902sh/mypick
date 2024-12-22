package com.mega.boardnew.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service  // Spring에서 관리하는 Bean에 등록
@Mapper   // MyBatis와 연결
public interface TimeMapper {
	
	// 1. Annotation 방식
	@Select("select sysdate() from dual")
	public String getTime();
	
	// 2. XML 방식
	public String getTimeUsingXML();
}
