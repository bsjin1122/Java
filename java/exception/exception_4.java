public class exception_4 {
	// 문제4: 문자열 파싱 - 문자열을 정수로 파싱하고, 잘못된 형식의 문자열이 입력되었을 때 예외
	public static void main(String[] args) {
		String numberString = "123a";
		try{
			int number = Integer.parseInt(numberString);
			System.out.println("정수로 변환할 숫자 : " + number);
		}catch (NumberFormatException e){
			System.out.println("숫자 형식이 아닙니다. 숫자를 입력하세요.");
		}

	}
}
