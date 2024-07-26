package _2024.july;
/*
[JadenCase 문자열 만들기]
JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
*/
public class July_25 {
	public static void main(String[] args) {
		String s = "for  the last week";//"3people  unFollowed me";

		String[] sArr = s.split("");
		// ["3","p","e","o"]
		String answer = sArr[0].toUpperCase(); // 숫자, 문자에도 적용됨
		for(int i = 1; i < sArr.length; i++){
			if(sArr[i].equals(" ")){
				answer += sArr[i];
			}else{
				if(sArr[i-1].equals(" ")){
					answer += sArr[i].toUpperCase();
				}else{
					answer += sArr[i].toLowerCase();
				}
			}
		}
		System.out.println(answer);

	}
}
