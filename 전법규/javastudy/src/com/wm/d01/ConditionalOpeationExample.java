package com.wm.d01;

public class ConditionalOpeationExample {
	public static void main(String[] args) {
		
		int score = 85;		// ���� score�� �� ���� (85)
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');	// score�� ���� 90���� ũ�� A , 80���� ũ�� B , �� �ܿ� C
		System.out.println(score + "���� " + grade + "����Դϴ�.");		// score�� ���� 85�� �������� ������ �׿� �´� grade�� B
		
	}	// main
}	// class
