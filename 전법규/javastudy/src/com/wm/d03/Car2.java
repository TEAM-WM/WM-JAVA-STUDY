package com.wm.d03;

public class Car2 {
	// �ν��Ͻ� �ʵ� ����
	int speed;
	
	// �ν��Ͻ� �޼ҵ� ����
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	static void simulate() {
		// ��ü ����
		Car2 myCar = new Car2();		// car2 Ŭ������ ��ü�� ������ �� speed�� run()�� ���
		// �ν��Ͻ� ��� ���
		myCar.speed = 200;		// speed�� 200 ����
		myCar.run();
	}
	
	public static void main(String[] args) {
		// ���� �޼ҵ� ȣ��
		simulate();
		
		// ��ü ����
		Car2 myCar = new Car2();		// ���� ����
		// �ν��Ͻ� ��� ���
		myCar.speed = 60;
		myCar.run();
		
		
	}	// main
}	// class
