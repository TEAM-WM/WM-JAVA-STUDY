package webmon_khs_w03;

import java.util.Stack;
//동전케이스, 위에만 오픈되어 있는 스택구조,
//먼저 넣은 동전은 제일 밑에 깔리고 나중에 넣은 동전이 위에 쌓이기 때문에 제일 위의 동전부터 빼낼수 있다
public class StackExample {
	//stack 후입선출(LIFO: Last in first out) / 나중에 넣은 객체가 먼저 빠져나감
	public static void main(String[] args) {
		// stack 컬렉션 생성
		Stack<Coin> coinBox = new Stack<Coin>();

		// 동전 넣기
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		// 동전을 하나씩 꺼내기
		while (!coinBox.isEmpty()) {//비어있지 않다면 반복
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전: " + coin.getValue() + "원");
		}
	}

}
