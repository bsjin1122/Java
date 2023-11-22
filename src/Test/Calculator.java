package Test;
// 오버로딩 (적재하다-> 옆으로 쌓으면 여러개)
// 책 내용: 같은 메서드 이름, 다른 인자 목록으로 다수의 메서드를 중복 정의
// * 같은 이름의 메서드를 여러 개 정의하는 것으로, 매개변수의 개수나 타입을 다르게 하여 다양한 상황에 맞게 사용할 수 있도록 함
// - 매개변수의 개수, 타입, 순서 등이 달라야 한다.
// - 반환 타입은 오버로딩과는 무관하다.
public class Calculator {
    public int add(int a, int b){ // 2개의 int를 받음
        return a + b;
    }

    public double add(double a, double b) { // 2개의 실수를 받음
        return a + b;
    }

    public int add(int a, int b, int c) { // 3개의 정수를 받음
        return a + b + c;
    }
}
