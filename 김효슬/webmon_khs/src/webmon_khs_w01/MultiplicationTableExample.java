package webmon_khs_w01;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		// for문 중첩, 구구단
		for (int i = 2; i <= 9; i++) {
			System.out.println();
			System.out.println("----------"+i+"단"+"----------");
			for (int j = 1; j <=9; j++) {
				System.out.println(i + " × " + j + " = " + i*j);
			}
		}
	}

}
