package _2024.august;

import java.util.Set;
/* HashSet 요소를 해시 테이블에 저장하며, 순서가 보장되지 않습니다.
 * 가장 빠른 접근속도를 가집니다.
 * LinkedHashSet: 요소를 해시 테이블에 저장하지만, 요소가 추가된 순서를 유지합니다.
 * TreeSet : 요소를 이진 검색 트리의 형태로 저장하며, 요소가 자동으로 정렬됩니다.
 */

public class HashSet {
	public static void main(String[] args) {
		Set<String> set = new java.util.HashSet<>(); // HashSet 생성
		
		// 요소 추가
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Apple");
		
		// Set의 요소 출력
		System.out.println("Set의 요소: " + set);
		
		// Set의 크기 출력
		System.out.println("Set의 크기: " + set.size());
		
		// 요소 제거
		set.remove("Banana");
		
		// 특정 요소가 있는지 확인
		if(set.contains("Orange")){
			System.out.println("Set에 Orange가 포함되어 있습니다.");
		}
		// Set의 요소를 반복하여 출력
		for (String s : set) {
			System.out.println("Set 요소 = " + s);
		}
	}
}
