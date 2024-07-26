import java.util.Arrays;
import java.util.List;

public class Stream_2 {
	// 문제2: 숫자 리스트에서 짝수만 필터링하고, 합계 구하기
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// 스트림 생성, 중간 연산(짝수 필터링), 최종 연산(합계 계산)
		int sum = numbers.stream()
			.filter(n -> n % 2 == 0)
			.mapToInt(Integer::intValue)
			.sum();

		System.out.println("짝수의 합 : " + sum);
	}
}
