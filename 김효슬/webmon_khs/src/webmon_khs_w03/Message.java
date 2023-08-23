package webmon_khs_w03;
 
public class Message {
	public String command;
	public String to;
	//Queue 컬렉션: 메시지 큐 구현 예제
	//선입선출(fifo구조), 먼저 넣은 메시지가 반대쪽으로 먼저 나오기 때문에 넣은 순서대로 메시지가 처리됨.
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
