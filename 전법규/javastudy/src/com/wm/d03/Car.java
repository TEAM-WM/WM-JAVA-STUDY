package com.wm.d03;

public class Car {
	
	// �ʵ� ����
	String company = "�����ڵ���";
	String model;
	String color;
	int maxspeed;
	
	Car(String model){		// �Ű������� model �ϳ�
		// 20���� ������ ȣ��
		this(model,"����",250);		// �Ű������� ���� model�� ����, 250�� �������� ���
	}
	
	Car(String model, String color){		// �Ű������� model,color �� ��
		// 20���� ������ ȣ��
		this(model,color,250);		// �Ű������� ���� model,color�� 250�� �������� ���
	}
	
	Car(String model, String color, int maxspeed){		// �Ű������� model,color,maxspeed �� ��
		this.model = model;			// this ������ model�� ���� �ʵ忡�� ������ model, = ������ model�� �Ű������� ���� model
		// �ʵ��� �ִ� model�� �Ű������� ���� model ���� �ְڴٴ� �ǹ�
		this.color = color;			//	''
		this.maxspeed = maxspeed;	//	''
	}
	
}
