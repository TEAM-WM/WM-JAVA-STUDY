package com.wm.d05;

public class RemoteControlExample {
	public static void main(String[] args) {
		//�������̽� ���� ����
		RemoteControl rc;
		
		//Television ��ü�� �����ϰ� �������̼� ������ ����
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		//Audio ��ü�� �����ϰ� �������̼� ������ ����
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
}
