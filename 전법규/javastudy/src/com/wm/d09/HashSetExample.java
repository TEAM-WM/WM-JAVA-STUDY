package com.wm.d09;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		
		// HashSet �÷��� ����
		Set<Member> set = new HashSet<Member>();		// Member�� ������ Ÿ���� ��ü�� ����
		
		// Member ��ü ����
		set.add(new Member("ȫ�浿",30));
		set.add(new Member("ȫ�浿",30));		// �ν��Ͻ��� �ٸ����� ���� ��ü�̹Ƿ� ��ü 1���� ����
		
		// ����� ��ü �� ���
		System.out.println("�� ��ü �� : " + set.size());
		
		
	}	// main
}	// class
