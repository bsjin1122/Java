import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_4 {
	// 문제4: 리스트에서 중복된 숫자를 제거하고, 정렬하여 출력하기
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 5, 2, 3, 7, 5, 2, 1, 9, 0);

		// 스트림 생성, 중간 연산(중복 제거 및 정렬), 최종 연산(출력)
		List<Integer> uniqueSortedNumbers = numbers.stream()
											.distinct()
											.sorted()
											.collect(Collectors.toList());
		System.out.println("중복 없이 정렬된 숫자: " + uniqueSortedNumbers);
	}
}
