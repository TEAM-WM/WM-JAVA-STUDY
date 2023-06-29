package com.wm.d04;

public class AbstractMethodExample {
	public static void main(String[] args) {
		
		Dog dog = new Dog();		// Dog Ŭ������ ��ü dog ����
		dog.sound();		// Dog Ŭ������ sound() �޼ҵ� ȣ��
		
		Cat cat = new Cat();		// Cat Ŭ������ ��ü cat ����
		cat.sound();		// Cat Ŭ������ sound() �޼ҵ� ȣ��
		
		// �Ű������� ������
		animalSound(new Dog());		// animalSound() �޼ҵ��� �Ű������� ���� �ڵ� Ÿ�� ��ȯ�ȴ�
		animalSound(new Cat());		//		''
		
	}	// main
	
	public static void animalSound(Animal animal) {
		
		animal.sound();		// �������̵� �� �޼ҵ� ȣ��
		
	}	// animalSound
	
}	// class
