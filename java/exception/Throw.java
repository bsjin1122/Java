public class Throw {
	public static void main(String[] args) {
		try{
			validateAge(15); // CustomException 발생
		}catch (CustomException e){
			System.out.println("예외 발생: " + e.getMessage());
		}
	}
	public static void validateAge(int age) throws CustomException{
		if(age < 18){
			throw new CustomException("나이는 꼭 18세 이상이어야 합니다.");
		}
	}
}
