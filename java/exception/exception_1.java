import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_1 {
	//목표: 사용자로부터 숫자를 입력받고, 숫자가 아닌 값이 입력되었을 때 예외를 처리합니다.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			System.out.println("숫자를 입력하세요: ");
			int number = scanner.nextInt();
			System.out.println("내가 입력한 것: " + number);
		}catch (InputMismatchException e){
			System.out.println("잘못된 입력입니다. 숫자로 입력하세요.");
		}
	}
}
