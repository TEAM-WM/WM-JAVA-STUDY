package com.wm.d01;

import java.util.Scanner;

public class KeyControlExample {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);		// Scanner ��ü ����
		// ���� ����
		boolean run = true;	
		int speed = 0;			
		
		while(run) {		// while�� 
			// for���� ������ ��ŭ�� �ݺ����� ������, while���� ���ǽ��� true�� ��쿡�� �������� �ݺ��ȴ�. false�� �Ǿ����� ���ᰡ �Ǵ� �������� �ִ�
			// �׸��� ���ǽ��� false�� ��쿡�� �ƿ� ���� �������� ����
			System.out.println("----------------------");
			System.out.println("1.���� | 2.���� | 3.����");
			System.out.println("----------------------");
			System.out.println("����: ");
			
			String strNum = sc.nextLine();		// ���α׷��� �Է��� ���ڸ� �о��
			
			if (strNum.equals("1")) {			// ������ �о�� strNum�� 1�� ���
				speed++;			// speed�� 1����
				System.out.println("���� �ӵ� : " + speed);
			}else if(strNum.equals("2")) {		// strNum�� 2�� ���
				speed--;			// speed�� 1����
				System.out.println("���� �ӵ� : " + speed);
			}else if(strNum.equals("3")) {		// strNum�� 3�� ���
				run = false;		// true ���� run���� false�� ����� while�� ����
			}
		}
		
		System.out.println("���α׷� ����");
		
	}	// main
}	// class
