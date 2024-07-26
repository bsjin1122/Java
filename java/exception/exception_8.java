public class exception_8 {
	// 문제 8: 예외 체인 - 예외를 하나의 예외로 묶어서 처리합니다.
	public static void main(String[] args) {
		try{
			method1();
		}catch (Exception e){
			System.out.println("예외 발생: " + e.getMessage());
			e.printStackTrace();
		}
	}
	public static void method1() throws Exception{
		try{
			method2();
		}catch (Exception e){
			throw new Exception("method1에서 예외 발생", e);
		}
	}
	public static void method2() throws Exception{
		throw new Exception("method2에서 예외 발생!!");
	}
}
