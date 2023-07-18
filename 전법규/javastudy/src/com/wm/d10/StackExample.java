package com.wm.d10;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		// Stack 컬렉션 생성
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// 동전 넣기
		coinBox.push(new Coin(100));		
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));		// coinBox에 값을 추가		-->		push() 메소드
		
		// 동전을 하나씩 꺼내기
		while (!coinBox.isEmpty()) {	// 비어있지 않다면 반복
			Coin coin = coinBox.pop();		// 가장 위에 있는 값이 밖으로 빠져나온다		-->		pop() 메소드
			System.out.println("거내온 동전 : " + coin.getValue() + "원");	// 출력
		
		}	// while
	
	}	// main

}	// class
