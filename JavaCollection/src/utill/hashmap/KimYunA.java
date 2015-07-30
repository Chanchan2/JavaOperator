package utill.hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KimYunA {
	public static void main(String[] args) {
		/*
		 Map은 인터페이스 HashMap은 Map을 구현(Implements)한 클래스
		 * */ 
		Map<String, Integer> map = new HashMap<String, Integer>();
		// Key값이 String이고, Value가 숫자인 HashMap 객체를 생성
		// List 계열은 추가 add
		// Map 계열은 추가 put
		map.put("김연아", new Integer(98));	// int 타입은 맵에 들어올 수 없다.
		map.put("아사다 마오", new Integer(60));
		map.put("소트니코바", new Integer(30));
		/*
		 디자인패턴 23가지 중 Iterator 패턴을 사용해서
		 Map의 값을 출력 한다.
		 * */
		// 지금까지는 객체를 생성할 시
		// Set set = new Set(); 를 이용하여 만들었는데 Set, Iterator는 
		// 이 방법(생성자를 통한 생성)을 이용하지 않고, 다른 객체를 통해 리턴받는 방식으로
		// 생성을 하고 이를 팩토리 패턴이라고 한다.
		/* 1. Key 와 Value를 동시에 출력 */
		Set set = map.entrySet();
		// Iterator는 순환기의 의미 => 지하철 2호선
		Iterator it = set.iterator();
		// it.hasNext() 은 Value 가 커서(Iterator) 다음에 있는지 없는지 여부를 따져서
		// 있으면 while 룹을 계속 돌리고 없으면 Stop 한다.
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("참가자 : " + e.getKey() + "  점수 : " + e.getValue());
			
		}
		
		/* 2. 키만(<K, V>) 출력하는 경우*/ 
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		// set 은 toString() 이 내부적으로 Overriding이 되어 있다.
		// 따라서 set.toString() 하지 않아도 출력된다.
		
		/* 3. Value만(<K, V>) 출력하는 경우 */ 
		Collection values = map.values();
		Iterator it2 = values.iterator();
		int total = 0; // 지변 초기화
		while (it2.hasNext()) {
			// 맵 내부에서는 int가 기본형이라 볼 수 없고 반드시 Integer (= 기본형 int의 Wrapper 래퍼클래스)
			// 타입으로 놓아야 한다.
			Integer i = (Integer) it2.next();
			total += i.intValue();	// 각 선수들의 점수 합계	
		}
		System.out.println("이번 대회 평균점수 : " + total/set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
		// 위쪽에 있는 Collection은 인터페이스
		// 아래쪽에 있는 Collections는 클래스
		// 클래스.메소드() 의 형태로 나오면 이 메소드는 클래스메소드라고 부르고 다른 말로는 static method라고 부른다.
	}
}
