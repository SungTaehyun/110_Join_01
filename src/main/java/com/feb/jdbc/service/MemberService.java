package com.feb.jdbc.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feb.jdbc.dao.MemberDao;
import com.feb.jdbc.util.Sha512Encoder;

@Service
public class MemberService {
	//MemberService 클래스에서 @Autowired 애너테이션을 사용하여 MemberDAO 필드 사용 가능해짐.
	@Autowired
	private MemberDao memberDao;
	
	public int join(HashMap<String, String> params) {//HashMap은 사용자 정보와 관련된 여러 매개변수를 포함, 입력으로 HashMap인 params받음
		String passwd = params.get("passwd");//params, HashMap에서 비밀번호를 검색
		Sha512Encoder encoder = Sha512Encoder.getInstance();
		String encodeTxt = Sha512Encoder.getInstance().getSecurePassword(passwd);
		 params.put("passwd", encodeTxt); // 매개변수에서 원래의 비밀번호를 인코딩된 비밀번호로 교체
		
		 return memberDao.join(params); // 업데이트된 params HashMap을 매개변수로 전달하여 memberDao 객체주소에 있는 join 메소드를 호출
	}
	
}
