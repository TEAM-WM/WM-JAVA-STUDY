package com.wm.d05;

public interface RemoteControl {
	
	// ��� �ʵ�
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;		
	
	// �߻� �޼ҵ�
	void turnOn();			// �޼ҵ� ����θ� �ۼ�
	void turnOff();
	void setVolume(int volume);		// public abstract�� ������ �߻�޼ҵ�

}
