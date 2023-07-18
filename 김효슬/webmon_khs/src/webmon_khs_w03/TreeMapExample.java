package webmon_khs_w03;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		// treemap 키와 값이 저장된 entry를 저장, map컬렉션
		TreeMap<String, Integer> treeMap = new TreeMap<>();

		// 엔트리 저장
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 80);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);

		// 정렬된 엔트리를 하나씩 가져오기
		Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		System.out.println();

		// 특정 키에 대한 값 가져오기
		Entry<String, Integer> entry = null;
		entry = treeMap.firstEntry();
		System.out.println("제일 앞 단어: " + entry.getKey() + "-" + entry.getValue());
		entry = treeMap.lastEntry();
		System.out.println("제일 뒷 단어: " + entry.getKey() + "-" + entry.getValue());
		entry = treeMap.lowerEntry("ever");
		System.out.println("ever 앞 단어: " + entry.getKey() + "-" + entry.getValue() + "\n");

		// 내림차순으로 정렬하기
		NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
		Set<Entry<String, Integer>> descendingEntrySet = descendingMap.entrySet();
		for (Entry<String, Integer> e : descendingEntrySet) {
			System.out.println(e.getKey() + "-" + e.getValue());
		}
		System.out.println();

		// 범위 검색
		System.out.println("[c~h 사이의 단어 검색]");
		NavigableMap<String, Integer> rangMap = treeMap.subMap("c", true, "h", false);
		for (Entry<String, Integer> e : rangMap.entrySet()) {
			System.out.println(e.getKey() + "-" + e.getValue());
		}
	}
}


/*
 * TreeMapExample 클래스를 선언합니다. main() 메서드를 선언합니다. TreeMap<String, Integer>
 * treeMap = new TreeMap<>();를 사용하여 TreeMap 컬렉션을 생성합니다. 이 TreeMap은 문자열 키와 정수형 값이
 * 저장됩니다. treeMap.put()를 사용하여 엔트리를 저장합니다. treeMap.entrySet()를 사용하여 정렬된 엔트리를
 * 가져옵니다. for-each 문을 사용하여 정렬된 엔트리에서 하나씩 엔트리를 가져와 키와 값을 출력합니다.
 * treeMap.firstEntry()를 사용하여 TreeMap에서 가장 작은 키(제일 앞 단어)와 해당 값을 가져와 출력합니다.
 * treeMap.lastEntry()를 사용하여 TreeMap에서 가장 큰 키(제일 뒷 단어)와 해당 값을 가져와 출력합니다.
 * treeMap.lowerEntry("ever")를 사용하여 "ever"보다 작은 가장 가까운 키의 엔트리와 해당 값을 가져와 출력합니다.
 * treeMap.descendingMap()을 사용하여 TreeMap을 내림차순으로 정렬한 NavigableMap 객체를 생성합니다.
 * descendingMap.entrySet()를 사용하여 내림차순으로 정렬된 NavigableMap에서 엔트리를 가져옵니다. for-each
 * 문을 사용하여 내림차순으로 정렬된 NavigableMap에서 하나씩 엔트리를 가져와 키와 값을 출력합니다.
 * treeMap.subMap("c", true, "h", false)를 사용하여 "c" 이상 "h" 미만의 범위를 가진
 * NavigableMap 객체를 생성합니다. for-each 문을 사용하여 "c" 이상 "h" 미만의 범위를 가진 NavigableMap에서
 * 엔트리를 가져와 키와 값을 출력합니다. 이 예시를 통해 TreeMap의 기능과 사용법을 알 수 있습니다. TreeMap은 키와 값이 정렬된
 * 상태로 저장되며, 다양한 메서드를 사용하여 원하는 검색 및 정렬 작업을 수행할 수 있습니다.
 */
