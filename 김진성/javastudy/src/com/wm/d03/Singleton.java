package com.wm.d03;

public class Singleton {
	//private ���� ������ ���� ���� �ʵ� ����� �ʱ�ȭ
	private static Singleton singleton = new Singleton();
	
	//private ���� ������ ���� ������ ����
	public Singleton() {
	}

	//public ���� ������ ���� ���� �޼ҵ� ����
	public static Singleton getInstance() {
		return singleton;
	}

}
