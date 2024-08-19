package structural.facade;

// Main 클래스: Facade 패턴을 사용하는 클라이언트 코드
public class Main {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.operation();
	}
}
