package com.wm.d03;

public class Car2 {
	//�ν��Ͻ� �ʵ� ����
	int speed;
	
	//�ν���Ʈ �޼ҵ� ����
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	static void simulate() {
		//��ü ����
		Car2 mayCar2=new Car2();
		//�ν��Ͻ� ��� ���
		mayCar2.speed=200;
		mayCar2.run();
	}

	public static void main(String[] args) {
		//���� �޼ҵ� ȣ��
		simulate();
		
		//��ü ����
		Car2 myCar2=new Car2();
		//�ν��Ͻ� ��� ���
		myCar2.speed = 60;
		myCar2.run();
	}
}
