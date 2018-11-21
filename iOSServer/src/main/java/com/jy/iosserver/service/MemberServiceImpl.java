package com.jy.iosserver.service;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jy.iosserver.dao.MemberDAO;
import com.jy.iosserver.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDAO;

	@Override
	public MemberVO login(HttpServletRequest request) {
		//파라미터 읽기 
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//필요한 작업 수행 
		
		//DAO의 파라미터 만들기 
		/*
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPw(pw);
		*/
		Map<String, Object> member = new HashMap<>();
		member.put("id", id);
		member.put("pw", pw);
		
		//DAO 메소드를 호출하고 결과를 Controller한테 보내기 
		//selectOne은 데이터가 없으면 null을 리턴 
		return memberDAO.login(member);
	}
}
