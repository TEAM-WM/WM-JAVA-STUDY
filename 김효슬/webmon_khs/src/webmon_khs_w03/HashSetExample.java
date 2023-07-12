package webmon_khs_w03;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
//		hashSet 컬렉션 생성 set컬렉션 중 가장 많이 쓰임
//		(=구슬 주머니, 찾을때 저장할때 순서 다를수 있음, 인덱스로 관리x, 동일객체 중복저장x)
		Set<Member> set = new HashSet<Member>();

		//member 객체 저장
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		//인스턴트는 다르지만 동등 객체이므로 객체 1개만 저장됨.
		
		//저장된 객체 수 출력
		System.out.println("총 객체 수 : " + set.size());
	}
}
