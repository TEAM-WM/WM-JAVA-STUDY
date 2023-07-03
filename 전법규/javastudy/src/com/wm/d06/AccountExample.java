package com.wm.d06;

public class AccountExample {
	public static void main(String[] args) {
		
		Account account = new Account();	// Account Ŭ���� ��ü ����
		
		// �����ϱ�
		account.deposit(10000);		// ���¿� 10000 �Ա�
		System.out.println("���ݾ� : "+ account.getBalance() + "��");
		
		// ����ϱ�
		try {
			account.withdraw(30000);	// 30000�� ���
		} catch (InsufficientException e) {		// ���ܰ� �߻��ϸ�
			String message = e.getMessage();
			System.out.println(message);		// Account Ŭ���� 20���� �ڵ��� ()������ message
		}
		
	}	// main
}	// class
