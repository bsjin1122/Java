import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exception_3 {
	// 문제3: 파일을 읽고, 파일이 존재하지 않을 때 예외를 처리합니다.
	public static void main(String[] args) {
		File file = new File("example.txt");
		try{
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()){
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		}catch (FileNotFoundException e){
			System.out.println("파일을 찾을 수 없습니다. 파일 경로를 다시 확인해주세요.");
		}
	}
}
