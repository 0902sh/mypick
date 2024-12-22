package com.mega.boardnew.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mega.boardnew.bean.AttachFileVO;

@Mapper
public interface AttachFileMapper {

	public void insert(AttachFileVO vo);
	public List<AttachFileVO> findByBno(Long bno);
}
