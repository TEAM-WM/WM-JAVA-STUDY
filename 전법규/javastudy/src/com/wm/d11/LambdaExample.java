package com.wm.d11;

public class LambdaExample {
	public static void main(String[] args) {
		
		Person person = new Person();	// person��ü ����
		
		// ���๮�� �� �� �̻��� ��� �߰�ȣ �ʿ�
		person.action(() -> {
			System.out.println("����� �մϴ�");
			System.out.println("���α׷����� �մϴ�");
		});
		
		// ���๮�� �� ���� ��� �߰�ȣ ���� ����
		person.action(() -> System.out.println("����մϴ�"));;
		
	}

}
