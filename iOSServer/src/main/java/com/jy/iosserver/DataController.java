package com.jy.iosserver;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.jy.iosserver.domain.MemberVO;
import com.jy.iosserver.service.MemberService;

@RestController
public class DataController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="member/login", method=RequestMethod.GET)
	public Map<String, Object> login(HttpServletRequest request){
		Map<String, Object> map = new HashMap<>();
		
		//결과 받아오기 
		MemberVO member = memberService.login(request);
		//로그인 실패시
		if(member == null) {
			member = new MemberVO();
			member.setId("NULL");
		}
		//결과를 저장 
		map.put("result", member);
		
		//System.out.println(map.get("result"));
		
		return map;
	}
}
