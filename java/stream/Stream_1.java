import java.util.Arrays;
import java.util.List;

public class Stream_1 {
	// 문제1: 리스트의 각 요소를 대문자로 변환하고 출력하기
	public static void main(String[] args) {
		List<String> words = Arrays.asList("hello", "world", "java", "stream");

		// 스트림 생성, 중간 연산 (대문자로 변환), 최종 연산 (출력)
		words.stream()
			.map(String::toUpperCase)
			.forEach(System.out::println);
	}
}
