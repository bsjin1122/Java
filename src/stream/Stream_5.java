import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_5 {
	// 문제 5: 정수 리스트에서, 각 정수의 제곱을 계산하여 새로운 리스트로 반환하기
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> squaredNumbers = numbers.stream()
			.map(n -> n * n)
			.collect(Collectors.toList());
		System.out.println("제곱된 숫자: " + squaredNumbers);
	}
}
