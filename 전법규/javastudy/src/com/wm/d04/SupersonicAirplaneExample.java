package com.wm.d04;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();		// SupersonicAirplane Ŭ������ ��ü sa ����
		sa.takeOff();			// takeOff() �޼ҵ� ȣ��
		sa.fly();			// fly() �޼ҵ� ȣ��		flyMode = normal
		sa.flyMode = SupersonicAirplane.SUPERSONIC;		// flyMode�� supersonic ���� ����
		sa.fly();			// flyMode�� supersonic�� ä�� fly() �޼ҵ� ȣ��
		sa.flyMode = SupersonicAirplane.NORMAL;		// flyMode�� normal�� ����
		sa.fly();			// flyMode�� normal�� ���¿����� fly() �޼ҵ� ȣ��
		sa.land();		// land() �޼ҵ� ȣ��
		
	}	// main
}	// class
