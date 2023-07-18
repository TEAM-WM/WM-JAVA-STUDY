package com.wm.d10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		
		// Queue �÷��� ����
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// �޼��� �ֱ�
		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSMS", "�ſ��"));
		messageQueue.offer(new Message("sendKakaotalk", "���ڹ�"));		// �ش� ť�� �� �ڿ� ������ ���� --> offer() �޼ҵ�	 -->  ������ true, Ʋ���� false ��ȯ
		
		// �޼����� �ϳ��� ������ ó��
		while (!messageQueue.isEmpty()) {		// messageQueue�� ��������� �ʴ´ٸ� �ݺ�
			Message message = messageQueue.poll();		// poll() : ť�� �� ���� �����͸� ��ȯ�ϰ� ����	, ���� ť�� ����ִٸ� null ��ȯ
			switch (message.command) {		// switch ~ case ���ǹ�
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "sendSMS":
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "�Կ��� īī������ �����ϴ�.");
				break;
			}	// switch
		}	// while
		
	}	// main

}	// class
