package com.wm.d08;

public class User1Thread extends Thread {		// ������ ���
	private Calculator calculator;
	
	public User1Thread() {
		setName("User1Thread");		// �������� �̸��� ����
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;		// �ܺο��� ���� ��ü�� Calculator�� �޾� �ʵ忡 ����
	}

	@Override
	public void run() {		// �����带 �۾��� ���� �ۼ�
		calculator.setMemory1(100);		// ����ȭ �޼ҵ� ȣ��
	}
	
	

}
