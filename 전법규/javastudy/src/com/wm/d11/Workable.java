package com.wm.d11;

// FunctionalInterface (함수형 인터페이스)
// 단 하나만의 추상 메소드를 가질 때의 인터페이스
// 인터페이스가 함수형 인터페이스임을 보장하기 위해서는 @FunctionalInterface 어노테이션을 붙이면 된다
// 어노테이션을 붙이는 것은 선택사항, 붙일 시 컴파일 과정에서 추상메소드가 한 개인지를 검사하기 때문에 정확한 함수형 인터페이스 작성을 도와주는 역할을 한다
@FunctionalInterface
public interface Workable {
	void work();
}
