import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class exception_5 {
	// 문제7: 리소스 자동 닫기 - try-with-resource 구문 사용하여 파일 닫고, 리소스를 자동으로 닫습니다.
	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new FileReader("example.txt"))){
			String line;
			while((line = reader.readLine())!= null){
				System.out.println(line);
			}
		}catch (IOException e){
			System.out.println("파일 읽기 에러 : " + e.getMessage());
		}
	}
}
