package com.wm.d06;

public class InsufficientException extends Exception {		// �Ϲ� ���ܷ� ����
	
	// 2���� ������ ����
	public InsufficientException() {	// �Ű����� x
		
	}
	
	public InsufficientException(String message) {	// String Ÿ���� message ��� �Ű������� �޴´�
		super(message);
	}
}
