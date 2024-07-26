package Test;

public class CallByValue {
    public static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a + " " + b); // 1  2
        swap(a, b);
        System.out.println(a + " " + b); // 1  2
        // 함수 호출 시 전달되는 변수의 값을 복사하여 함수의 인자로 전달한다.
        // JAVA의 경우 함수에 전달되는 인자에 데이터 타입에 따라 (기본형/참조형) 함수 호출 방식이 달라진다.
    }
}


