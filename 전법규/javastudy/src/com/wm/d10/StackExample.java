package com.wm.d10;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		// Stack �÷��� ����
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// ���� �ֱ�
		coinBox.push(new Coin(100));		
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));		// coinBox�� ���� �߰�		-->		push() �޼ҵ�
		
		// ������ �ϳ��� ������
		while (!coinBox.isEmpty()) {	// ������� �ʴٸ� �ݺ�
			Coin coin = coinBox.pop();		// ���� ���� �ִ� ���� ������ �������´�		-->		pop() �޼ҵ�
			System.out.println("�ų��� ���� : " + coin.getValue() + "��");	// ���
		
		}	// while
	
	}	// main

}	// class
