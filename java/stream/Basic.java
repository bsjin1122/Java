import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*자바 스트림
자바 8부터 도입된 기능으로, 데이터 컬렉션을 처리하는 데 사용
스트림은 컬렉션에 저장된 데이터를 간단하고 간결하게 처리할 수 있도록 도와줍니다.
*/
public class Basic {
	public static void main(String[] args) {
		// 1. 생성
		List<String> list = Arrays.asList("a","b", "c");
		Stream<String> stream = list.stream();

		// 2. 중간 연산
		Stream<String> upperStream = stream.map(String::toUpperCase);

		// 3. 최종 연산
		upperStream.forEach(System.out::println);
	}
}
