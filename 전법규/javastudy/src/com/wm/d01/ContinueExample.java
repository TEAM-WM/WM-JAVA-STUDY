package com.wm.d01;

public class ContinueExample {
	public static void main(String[] args) throws Exception {
		
		for(int i=1; i<=10; i++) {		// i�� 1���� 10���� 1�� ����
			if(i%2 != 0) {		// i�� 2�� �������� ���� �������� 0�� �ƴ� ���, 2�� �������� �� �������� Ȧ���� ���
				continue;		// �ʹ����� Ȧ���ΰ�쿡, for��(6������ �ڵ�)���� ����
			}	// if
			System.out.print(i + " ");	// �������� 0�ΰ��,¦���� ��� ����, Ȧ���� ��쿡�� ����x
		}	// for
		
	}	// main
}	// class
