package com.jy.iosserver.service;

import javax.servlet.http.HttpServletRequest;
import com.jy.iosserver.domain.MemberVO;

//사용자의 요청을 처리하기 위한 메소드의 원형을 만드는 곳 
public interface MemberService {
	
	//로그인을 처리하기 위한 메소드 
	public MemberVO login(HttpServletRequest request);
}
