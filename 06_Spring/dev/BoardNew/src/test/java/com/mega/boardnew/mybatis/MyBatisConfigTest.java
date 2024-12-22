package com.mega.boardnew.mybatis;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class MyBatisConfigTest {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testDataSource() {
		log.info("DataSource : " + dataSource);
		 
		try {
			Connection conn = dataSource.getConnection();
			log.info("DataSource Connection : " + conn);
		}
		catch(Exception e) { e.printStackTrace(); }
	}
	
	@Test
	public void testSqlSession() {
		try {
			SqlSession sqlSession = sqlSessionFactory.openSession(true);
			log.info("SQL Session : " + sqlSession);
			
			Connection conn = sqlSession.getConnection();
			log.info("SQL Session conn : " + conn);
		}
		catch(Exception e) { e.printStackTrace(); }
	}
}
