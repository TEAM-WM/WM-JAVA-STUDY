package com.wm.d11;

public class LamdaExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		//���๮�� �� �� �̻��� ��� �߰�ȣ �ʿ�
		person.action(() -> {
			System.out.println("����� �մϴ�.");
			System.out.println("���α׷����� �մϴ�.");
		});
		
		//���๮�� �� ���� ��� �߰�ȣ ���� ����
		person.action(() -> System.out.println("����մϴ�."));
	}

}
