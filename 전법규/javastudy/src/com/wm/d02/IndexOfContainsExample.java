package com.wm.d02;

public class IndexOfContainsExample {
	public static void main(String[] args) {
		
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");		// "���α׷���"�� �����°� 3����
		System.out.println(location);
		String substring = subject.substring(location);		// location�� 3�̿��� ������ subject���� 3��° ������ ���ڸ� ��� ���
		System.out.println(substring);
		
		location = subject.indexOf("�ڹ�");		// 0
		if(location != -1) {		// location�� -1�� �ƴ϶��
			System.out.println("�ڹٿ� ���õ� å�̱���");
		}else {
			System.out.println("�ڹٿ� ���� ���� å�̱���");
		}
		
		boolean result = subject.contains("�ڹ�");		// "�ڹ�"�� subject�� ���ԵǾ� �ִ°�, true of false
		if(result) {		// true
			System.out.println("�ڹٿ� ���õ� å�̱���");
		}else {		// false
			System.out.println("�ڹٿ� ���� ���� å�̱���");
		}	
		
	}	// main
}	// class
