package com.wm.d05;

public class Television implements RemoteControl{
	//�ʵ�
	private int volume;
	
	//turnOn() �߻� �޼ҵ� �������̵�
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	//turnOff() �߻� �޼ҵ� �������̵�
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	//turnOff() �߻� �޼ҵ� �������̵�
	@Override
	public void setVolume(int volume) {
		if (volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume= volume;
		}
		System.out.println("���� TV ���� : "+this.volume);
	}

}
