package webmon_khs_w03;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//Treeset 컬렉션 생성, 무작위로 저장한 점수를 검색하는 방법
		TreeSet<Integer> scores = new TreeSet<>();
		
		//Integer 객체 저장
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		//정렬된 Integer 객체를 하나씩 가져오기
		for(Integer s : scores) {
			System.out.print(s + " ");
		}
		System.out.println("\n");

		//특정 Integer 객체를 가져오기
		System.out.println("가장 낮은 점수: "+ scores.first());
		System.out.println("가장 높은 점수: "+ scores.last());
		System.out.println("95점 아래 점수: "+ scores.lower(95));
		System.out.println("95점 위의 점수: "+ scores.higher(95));
		System.out.println("95점이거나 바로 아래 점수: "+ scores.floor(95));
		System.out.println("85점이거나 바로 위의 점수: "+ scores.ceiling(85)+"\n");

		//내림차순으로 정렬하기
		NavigableSet<Integer> descendingScores = scores.descendingSet();
		for(Integer s : descendingScores) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		//범위 검색( 80 <= )
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		//범위 검색 ( 80 <= score < 90 )
		rangeSet = scores.subSet(80, true, 90, false);
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
			
		}
	}
}

/*
 * TreeSetExample 클래스를 선언합니다. main() 메서드를 선언합니다. TreeSet<Integer> scores = new
 * TreeSet<>();를 사용하여 TreeSet 컬렉션을 생성합니다. scores.add()를 사용하여 정수형 객체를 TreeSet에
 * 추가합니다. for-each 문을 사용하여 정렬된 scores에서 하나씩 정수형 객체를 가져와 출력합니다. scores.first()를
 * 사용하여 TreeSet에서 가장 작은 값(가장 낮은 점수)을 가져와 출력합니다. scores.last()를 사용하여 TreeSet에서 가장
 * 큰 값(가장 높은 점수)을 가져와 출력합니다. scores.lower(95)를 사용하여 95보다 작은 가장 가까운 값(95점 아래 점수)을
 * 가져와 출력합니다. scores.higher(95)를 사용하여 95보다 큰 가장 가까운 값(95점 위의 점수)을 가져와 출력합니다.
 * scores.floor(95)를 사용하여 95보다 작거나 같은 가장 가까운 값(95점이거나 바로 아래 점수)을 가져와 출력합니다.
 * scores.ceiling(85)를 사용하여 85보다 크거나 같은 가장 가까운 값(85점이거나 바로 위의 점수)을 가져와 출력합니다.
 * scores.descendingSet()을 사용하여 TreeSet을 내림차순으로 정렬한 NavigableSet 객체를 생성합니다.
 * for-each 문을 사용하여 내림차순으로 정렬된 NavigableSet에서 하나씩 정수형 객체를 가져와 출력합니다.
 * scores.tailSet(80, true)을 사용하여 80 이상의 범위를 가진 NavigableSet 객체를 생성합니다. for-each
 * 문을 사용하여 80 이상의 범위를 가진 NavigableSet에서 하나씩 정수형 객체를 가져와 출력합니다. scores.subSet(80,
 * true, 90, false)를 사용하여 80 이상 90 미만의 범위를 가진 NavigableSet 객체를 생성합니다. for-each
 * 문을 사용하여 80 이상 90 미만의 범위를 가진 NavigableSet에서 하나씩 정수형 객체를 가져와 출력합니다. 이 예시를 통해
 * TreeSet의 기능과 사용법을 알 수 있습니다. TreeSet은 중복을 허용하지 않고, 객체들이 정렬된 상태로 저장됩니다. 또한, 다양한
 * 메서드를 사용하여 원하는 검색 및 정렬 작업을 수행할 수 있습니다.
 */
