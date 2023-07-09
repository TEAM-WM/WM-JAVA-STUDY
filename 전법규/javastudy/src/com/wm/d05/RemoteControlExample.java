package com.wm.d05;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		// �������̽� ���� ����
		RemoteControl rc;
		
		// Television ��ü�� �����ϰ� �������̽� ������ ����
		rc = new Television();	// �������̽��� Television ��ü ���
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(20);
		rc.setVolume(-2);
		rc.turnOff();
		
		System.out.println("-------------------------");
		
		// Audio ��ü�� �����ϰ� �������̽� ������ ����
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(20);
		rc.setVolume(-2);
		rc.turnOff();
		
	}	// main
}	// class
