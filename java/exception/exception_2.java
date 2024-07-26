public class exception_2 {
	// 문제2: 배열의 특정 인덱스에 접근하고, 배열의 범위를 벗어난 인덱스에 접근할 때 예외를 처리
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		try{
			System.out.println("배열의 인덱스 5: " + array[5]);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("배열 인덱스를 넘었습니다. 유효한 인덱스로 접근하세요. ");
		}
	}
}
