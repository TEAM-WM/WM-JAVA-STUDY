package com.wm.d11;

public class LamdaExample2 {
	public static void main(String[] args) {
		Person2 person2 = new Person2();
		
		//�Ű������� �� ���� ���
		person2.action1((name, job) -> {
			System.out.print(name + "�� ");
			System.out.println(job + "�� �մϴ�.");
		});
		person2.action1((name, job) -> System.out.println(name + "�� "+job+"�� ���� �ʽ��ϴ�."));
		
		//�Ű������� �� ���� ���
		person2.action2(word -> {
			System.out.print("\""+word+"\"");
			System.out.println("��� ���մϴ�.");
		});
		person2.action2(word -> System.out.println("\""+word+"\"��� ��Ĩ�ϴ�."));
	}

}
