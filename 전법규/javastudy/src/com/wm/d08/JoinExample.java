package com.wm.d08;

public class JoinExample {
	public static void main(String[] args) {
		
		SumThread sumThread = new SumThread();		// Ŭ���� SumThread�� ��ü sumThread ����
		sumThread.start();		// ������ ����
		try {
			sumThread.join();		// main�� SumThread Ŭ������ run() �޼ҵ尡 ���� ����Ǳ⸦ ��ٸ��� �ϴ� Join() �޼ҵ�
		} catch (InterruptedException e) {		// ���� ó��
			
		}
		
		System.out.println("1~100 �� : " + sumThread.getSum());	// ���
		
	}	// main
}	// class
