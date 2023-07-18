package com.wm.d10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		
		// Queue 컬렉션 생성
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// 메세지 넣기
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "감자바"));		// 해당 큐의 맨 뒤에 데이터 삽입 --> offer() 메소드	 -->  맞으면 true, 틀리면 false 반환
		
		// 메세지를 하나씩 꺼내어 처리
		while (!messageQueue.isEmpty()) {		// messageQueue가 비어있지만 않는다면 반복
			Message message = messageQueue.poll();		// poll() : 큐의 맨 앞의 데이터를 반환하고 삭제	, 만약 큐가 비어있다면 null 반환
			switch (message.command) {		// switch ~ case 조건문
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}	// switch
		}	// while
		
	}	// main

}	// class
