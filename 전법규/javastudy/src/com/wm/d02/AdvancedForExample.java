package com.wm.d02;

public class AdvancedForExample {
	public static void main(String[] args) {
		
		// �迭 ���� ����� �迭 ����
		int[] scores = {95,71,84,93,87};		// int�� �迭�� scores (ũ�� : 5)
		
		// �迭 �׸� ��ü �� ���ϱ�
		int sum = 0;
		for(int score : scores) {			// scores�� �� �����͵��� score�� �����´�
			sum = sum + score;				// ������ score���� sum�� ����
		}
		System.out.println("���� ���� = " + sum);				// score ���� ��
		
		// �迭 �׸� ��ü ��� ���ϱ�
		double avg = (double) sum / scores.length;	
		System.out.println("���� ��� = " + avg);
		
	}	// main
}	// class
