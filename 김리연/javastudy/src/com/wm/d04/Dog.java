package com.wm.d04;

public class Dog extends Animal {
	// 추상 메소드 재정의 오버라이딩
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}//