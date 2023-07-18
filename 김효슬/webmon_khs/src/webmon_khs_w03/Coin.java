package webmon_khs_w03;
//stack 후입선출(LIFO: Last in first out) / 나중에 넣은 객체가 먼저 빠져나감
public class Coin {
//	동전케이스, 위에만 오픈되어 있는 스택구조,
//	먼저 넣은 동전은 제일 밑에 깔리고 나중에 넣은 동전이 위에 쌓이기 때문에 제일 위의 동전부터 빼낼수 있다
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
