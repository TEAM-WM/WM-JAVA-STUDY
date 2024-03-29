package com.wm.d10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		//Queue �÷��� ����
		Queue<Message> messageQueue = new LinkedList<>();
		
		//�޽��� �ֱ�
		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSMS", "�ſ��"));
		messageQueue.offer(new Message("sendKakaotalk", "���ڹ�"));
		
		//�޽����� �ϳ��� ������ ó��
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "sendSMS":
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "�Կ��� īī������ �����ϴ�.");
			}
		}
	}
}
