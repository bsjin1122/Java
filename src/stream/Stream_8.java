import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_8 {
	// 문제8: 정수 리스트에서 중복을 제거하고 셋으로 수집하기
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6);
		Set<Integer> uniqueNumbers = numbers.stream()
			.collect(Collectors.toSet());
		System.out.println("중복을 제거한 숫자들: " + uniqueNumbers);
	}
}
