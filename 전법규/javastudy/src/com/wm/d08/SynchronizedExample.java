package com.wm.d08;

public class SynchronizedExample {
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();		// calculator ��ü ����
		
		User1Thread user1Thread = new User1Thread();	// user1Thread ��ü ����
		user1Thread.setCalculator(calculator);
		user1Thread.start();		// ������ ����
		
		User2Thread user2Thread = new User2Thread();	// user2Thread ��ü ����
		user2Thread.setCalculator(calculator);
		user2Thread.start();		// ������ ����
		
	}	// main
}	// class
