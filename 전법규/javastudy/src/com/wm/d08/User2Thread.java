package com.wm.d08;

public class User2Thread extends Thread {
	
	private Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread");		// ������ �̸�����
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;		// �ܺο��� ���� ��ü�� Calculator�� �޾� �ʵ忡 ����
	}
	
	@Override
	public void run() {
		calculator.setMemory2(50);		// ����ȭ ����� ���� �޼ҵ� ȣ��
	}
	
}
