package com.wm.d03;

public class SingletonExample {
	public static void main(String[] args) {
		
//		Singleton obj1 = new Singleton();		// ������ ����
//		Singleton obj2 = new Singleton();		// ������ ����		// private�� ���� ���� �Ұ�
		
		// ���� �޼ҵ带 ȣ���ؼ� �̱��� ��ü ����
		Singleton obj1 = Singleton.getInstance();		// obj1 �� singleton�� ����
		Singleton obj2 = Singleton.getInstance();		// obj2 �� singleton�� ����
		
		// ������ ��ü�� �����ϴ��� Ȯ��
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
		
	}	// main
}	// class
