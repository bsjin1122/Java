package _2024.august;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		// LinkedHashSet 생성
		Set<String> set = new LinkedHashSet<>();

		// 요소 추가
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Apple"); // 중복된 요소는 추가되지 않음

		System.out.println("LinkedListHashSet의 요소 : " + set);


	}
}
