package _2024.july;

import java.util.HashSet;

/* [두 개의 수로 특정값 만들기]
* n개의 양의 정수로 이루어진 배열 arr와 정수 target이 주어졌을 때, 이 중에서 합이 target인
* 두 수가 arr에 있는지 찾고, 있으면 true, 없으면 false를 반환하는 solution()함수를 작성하세요.
* */
public class July_28 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 8};
		int target = 6;
		boolean answer = false;
		HashSet<Integer> hashSet = new HashSet<>();
		for(int i : arr){
			if(hashSet.contains(target - i)){
				answer =  true;
			}
			hashSet.add(i);
		}
		System.out.println(answer);

	}
}
