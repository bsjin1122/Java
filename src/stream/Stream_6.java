import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_6 {
	// 문제 6: 문자열 리스트에서 문자열의 길이를 키로 하고, 문자열을 값으로 하는 맵 생성
	public static void main(String[] args) {
		List<String> words = Arrays.asList("hello", "world", "java", "stream", "API");
		Map<Integer, List<String>> lengthMap = words.stream()
			.collect(Collectors.groupingBy(String::length));
		System.out.println("Map 단어 길이 :" + lengthMap);
	}
}
