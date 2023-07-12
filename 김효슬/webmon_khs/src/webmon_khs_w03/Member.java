package webmon_khs_w03;
//hashSet 컬렉션 생성 set컬렉션 중 가장 많이 쓰임
//(=구슬 주머니, 찾을때 저장할때 순서 다를수 있음, 인덱스로 관리x, 동일객체 중복저장x)
public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// hashCode 재정의
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	} // name과 age값이 같으면 동일한 hashcode가 리턴됨.

	// equals 재정의
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member target) {
			return target.name.equals(name) && (target.age == age);
		} else {
			return false;
		}
	}
}
