public class exception_7 {
	// 문제7: 예외를 한 메서드에서 처리한 후 다시 던집니다.

	// [출력]
	// method1에서 예외 발생: method2에서 예외 발생
	// main 메소드에서 예외 발생: method2에서 예외 발생
	public static void main(String[] args) {
		try{
			method1();
		}catch (Exception e){
			System.out.println("main 메소드에서 예외 발생: " + e.getMessage());
		}
	}
	public static void method1() throws Exception{
		try{
			method2();
		}catch (Exception e){
			System.out.println("method1에서 예외 발생: " + e.getMessage());
			throw e; // 예외 다시 던지기
		}
	}
	public static void method2() throws Exception{
		throw new Exception("method2에서 예외 발생");
	}
}
