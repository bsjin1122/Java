import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_3 {
	// 문제3: 문자열 리스트에서 특정 길이 이상의 문자열만 필터링하여 리스트로 반환하기
	public static void main(String[] args) {
		List<String> words = Arrays.asList("hello", "world", "java", "stream", "API");

		// 스트림 생성, 중간 연산(길이 필터링), 최종 연산(리스트로 수집)
		List<String> longWords = words.stream()
			.filter(word -> word.length() >= 4)
			.collect(Collectors.toList());

		System.out.println("4보다 같거나 큰 길이의 단어: " + longWords);
	}
}
