public class exception_6 {
	// 문제 6: 하나의 try 블록에서 여러 종류의 예외를 처리
	public static void main(String[] args) {
		try{
			int[] array = {1, 2, 3};
			System.out.println(array[3]);
			int result = 10 / 0;
		}catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
			System.out.println("예외 발견: " + e.toString());
		}
	}
}
