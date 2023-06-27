package com.wm.d03;

public class Singleton {
	
	// private ���� ������ ���� ���� �ʵ� ����� �ʱ�ȭ
	private static Singleton singleton = new Singleton();
	
	// private ���� ������ ���� ������ ����
	private Singleton() {
		
	}
	
	// public ���� ������ ���� ���� �޼ҵ� ����
	static Singleton getInstance() {		// �ܺο��� singleton�� ���� �������� ������ getInstance()�� ���
		return singleton;			// singleton ����
	}
	
}	// class
