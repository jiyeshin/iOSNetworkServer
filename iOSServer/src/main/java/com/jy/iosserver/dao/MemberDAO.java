package com.jy.iosserver.dao;

import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jy.iosserver.domain.MemberVO;

@Repository
public class MemberDAO {
	@Autowired
	private SqlSession sqlSession;
	
	//로그인 처리 메소드
	//받아오는 값이 하나라서 굳이 List로 감싸지 않음.
	public MemberVO login(Map map){
		return sqlSession.selectOne("member.login", map);
	}
}
