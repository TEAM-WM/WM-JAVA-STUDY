package webmon_khs_w03;

import java.util.LinkedList;
import java.util.Queue;

// Queue 컬렉션 생성 
public class QueueExample {
	public static void main(String[] args) {
		//queue 메시지 큐 구현 예제/ 선입선출(fifo구조), 먼저 넣은 메시지가 반대쪽으로 먼저 나오기 때문에 넣은 순서대로 메시지가 처리됨.
		Queue<Message> messageQueue = new LinkedList<>();
		
		//메시지 넣기
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "감자바"));
		
		//메시지를 하나씩 꺼내어 처리
		while (!messageQueue.isEmpty()) {//비어있지 않다면 반복
			Message message = messageQueue.poll();
			switch (message.command) {
			
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;

			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;

			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
			
		}
		
	}

}
