package com.wm.d01;

public class MultiplicationTableExample {
	public static void main(String[] args) {
		
		for(int m=2; m<=9; m++) {	// m�� 2���� 9���� 1�� ����
			System.out.println("*** " + m + "�� ***");		// �Ʒ� for���� �� ���� �������� �ѹ� ���ư�
			for(int n=1; n<=9; n++) {		// n�� 1���� 9���� 1�� ����
				System.out.println(m + " x " + n + " = " + (m*n));
				// m�� 1 ������ ������ n�� 1~9���� ���°� �ݺ�
			}
			System.out.println("--------------------------");
		}

	}	// main
}	// class
