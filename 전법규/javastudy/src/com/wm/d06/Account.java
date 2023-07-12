package com.wm.d06;

public class Account {
	private long balance;		// �ܰ�
	
	public Account() {
		
	}

	public long getBalance() {		// getter , �ܺο��� (����������)private�� ������ �Ұ��� balance���� �������� ���� �� ���
		return balance;		// (�ܰ�)balance ����
	}
	
	public void deposit(int money) {	// �Ա�
		balance += money;	// �ܰ� (�Ű������� ����)money�� ����
	}
												// ȣ���� ������ ���ܸ� ���ѱ�
	public void withdraw(int money) throws InsufficientException{		// ���
		if(balance < money) {		// (�Ű������� ����)money�� ���� (�ܰ�)balance�� ������ ũ��
			throw new InsufficientException("�ܰ���� : " + (money-balance) + "�� ���ڶ�");	// ���� �߻�
			// insufficientException(���ܸ�) �߻���Ű�� throw 
		}
		balance -= money;
	}
	
}	// class
