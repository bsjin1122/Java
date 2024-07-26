public class TryCatch {
	public static void main(String[] args) {
		try{
			int result = 10 / 0; // ArithmeticException 발생
		}catch (ArithmeticException e){
			System.out.println("0으로 나눌 수 없음" + e.getMessage());
		}
	}
}
