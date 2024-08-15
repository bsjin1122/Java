package creational.singleton;

/* 싱글톤 패턴 : 클래스의 인스턴스가 하나만 존재하도록 하고, 전역적으로 접근할 수 있게 합니다. */
public class BasicSingleton {
	private static BasicSingleton instance; // private static 인스턴스

	// private 생성자
	private BasicSingleton(){
		// 생성자를 private 으로 선언하여 외부에서 인스턴스를 생성하지 못하게 함
	}
	// public static 메서드로 인스턴스를 반환
	public static BasicSingleton getInstance(){
		if(instance == null){
			instance = new BasicSingleton();
		}
		return instance;
	}

	// 싱글톤클래스의 메서드 예제
	public void showMessage(){
		System.out.println("hello from basicSingleton!");
	}

	public static void main(String[] args) {
		BasicSingleton singleton = BasicSingleton.getInstance();
		singleton.showMessage();
	}

}
