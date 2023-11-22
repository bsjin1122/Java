package Test;

public class CallByValue {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("1. " + num);
        changeValue(num); // 기본 데이터 타입을 메서드에 전달할 때는 값 자체가 복사되어 전달되며,
        // 호출된 메서드에서 값을 변경해도 호출한 곳의 변수는 영향을 받지 않는다.
        System.out.println("2. " + num);
    }

    public static void changeValue(int x) {
            x = 20;
    }
}
