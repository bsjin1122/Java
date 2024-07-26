import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_7 {
	// 문제 7: 학생 객체 리스트에서 학생 이름을 키로 하고, 점수를 값으로 하는 맵 생성하기
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
			new Student("John", 85),
			new Student("Jane", 65),
			new Student("Tom", 90),
			new Student("Lucy", 70)
		);

		Map<String, Integer> studentScoreMap = students.stream()
			.collect(Collectors.toMap(Student::getName, Student::getScore));

		System.out.println("학생별 점수: " + studentScoreMap);

	}
}
