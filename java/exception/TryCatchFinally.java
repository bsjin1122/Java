public class TryCatchFinally {
	public static void main(String[] args) {
		try{
			int result = 10 / 0;
		}catch (ArithmeticException e){
			System.out.println("0으로 나눌 수 없음: " + e.getMessage());
		}finally {
			System.out.println("이 블록은 항상 실행됩니다.");
		}
	}
}
