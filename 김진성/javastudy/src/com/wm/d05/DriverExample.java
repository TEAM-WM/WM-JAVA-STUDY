package com.wm.d05;

public class DriverExample {
	public static void main(String[] args) {
		//Driver ��ü ����
		Driver driver = new Driver();
		
		//Vehicle ���� ��ü ����
		Bus2 bus2 = new Bus2();
		Taxi taxi = new Taxi();
		
		//�Ű����� ���� ��ü ����(������ : ���� ����� �ٸ�)
		driver.drive(bus2);
		driver.drive(taxi);
	}
}
