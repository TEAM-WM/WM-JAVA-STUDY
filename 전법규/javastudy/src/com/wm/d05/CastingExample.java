package com.wm.d05;

public class CastingExample {
	public static void main(String[] args) {
		
		// �������̽� ���� ����� ���� ��ü ����
		Vehicle vehicle = new Bus();	
		
		// �������̽��� ���ؼ� ȣ��
		vehicle.run();
//		vehicle.checkFare();	(x)
		
		// ���� Ÿ�� ��ȯ
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
		
	}	// main
}	// class
