package com.wm.d05;

public class Television implements RemoteControl {	// RemoteControl �������̽� ����
	
	// �ʵ�
	private int volume;

	@Override		// �������̽� RemoteControl�� �߻� �޼ҵ� �������̵�
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}

	@Override
	public void setVolume(int volume) {		
		if(volume > RemoteControl.MAX_VOLUME) {		
			this.volume = RemoteControl.MAX_VOLUME;		// (�Ű������� ����)volume ���� MAX_VOLUME(10) ���� ũ�� (�ʵ���)volume = MAX_VOLUME(10)
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;		// (�Ű������� ����)volume ���� MIN_VOLUME(0) ���� ������ (�ʵ���)volume = MIN_VOLUME(0)
		}else {
			this.volume = volume;		// �Ű������� ���� volume���� �ʵ��� volume����
		}
		System.out.println("���� TV ���� : " + this.volume);
	}	// setVolume
	
}	// class
