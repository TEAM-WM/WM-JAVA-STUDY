package com.wm.d05;

public class Bus implements Vehicle{
	//�߻� �޼ҵ� ������
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	
	//�߰� �޼ҵ�
	public void checkFare() {
		System.out.println("��������� üũ�մϴ�.");
	}

}
