package member;

import java.lang.management.MemoryManagerMXBean;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// int  => String   String.valueof(int)

public class MemberServiceImpl implements MemberService {
	private Map<String, Member> memberMap = new HashMap<String, Member>();
	Member member = new Member();
	@Override
	public void join(Member inputMember) {
		member = inputMember;
		memberMap.put(inputMember.getId(), member);
		
		Set set = memberMap.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("아이디 : " + e.getKey() + "  점수 : " + e.getValue());
			
		}
	}

	@Override
	public String login(String id, String password) {
		String msg ="";
		if(memberMap.containsKey(id)){
			System.out.println("아이디 추출"+memberMap.get(id).toString());
			Collection values = memberMap.values();
			System.out.println("컬렉션 내부 밸류스 : "+values.toString());
			Iterator it = values.iterator();
			
			while (it.hasNext()) {
				// 맵 내부에서는 int가 기본형이라 볼 수 없고 반드시 Integer (= 기본형 int의 Wrapper 래퍼클래스)
				// 타입으로 놓아야 한다.
				if (password.equalsIgnoreCase(memberMap.get(id).getPassword())) {
					msg = "환영합니다. \n" + memberMap.get(id).getAddress() + " 에 사시는 "
							+ memberMap.get(id).getAge() + " 세 되시는 " + memberMap.get(id).getName()
							+ " 님";
					break;
				} else {
					msg = "비밀번호가 일치하지 않습니다.";
					break;
				}
				
			}
			/*if(password.equalsIgnoreCase(memberMap.get(id).getPassword())){
				
				msg = "환영합니다. \n" + memberMap.get(id).getAddress() + " 에 사시는 "
						+ memberMap.get(id).getAge() + " 세 되시는 " + memberMap.get(id).getName()
						+ " 님";
			} else {
				msg = "비밀번호가 일치하지 않습니다.";
			}*/
		} else {
			msg = "입력하신 ID는 존재하지 않거나, 일치하지 않습니다. ";
		}
			
		return msg;
		
		
		
	}



}
