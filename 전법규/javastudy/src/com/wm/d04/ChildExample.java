package com.wm.d04;

public class ChildExample {
	public static void main(String[] args) {
		
		// ��ü ���� �� �ڵ� Ÿ�� ��ȯ
		Parent parent = new Child();
		
		// Parent Ÿ������ �ʵ�� �޼ҵ� ���
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";	// �Ұ���		// parent Ŭ������ child Ŭ������ ����� ��� �� �� ���� ���� (child Ŭ������ parent Ŭ������ ��� ����� ����)
//		parent.method3();			// �Ұ���
		
		// ���� Ÿ�� ��ȯ
		Child child = (Child)parent;
		
		// child Ÿ������ �ʵ�� �޼ҵ� ���
		child.field2 = "data2";
		child.method3();
		
		
	}	// main
}	// class
