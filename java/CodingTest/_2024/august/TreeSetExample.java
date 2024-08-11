package _2024.august;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		// TreeSet 생성
		Set<String> set = new TreeSet<>();
		
		// 요소 추가
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Apple");
		
		// Set의 요소 출력(정렬된 순서로 출력)
		System.out.println("TreeSet의 요소 = " + set);
	}
}
