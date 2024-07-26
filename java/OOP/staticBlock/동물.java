package OOP.staticBlock;

public class 동물 {
//    public 동물() {
//        System.out.println("나 생성자야 누가 먼저 출력될까?");
//    }
    static{
        System.out.println("1. 동물 클래스 레디 온!");
    }
    // 출력 결과: static 블록이 실행되고, 생성자가 실행된다.
}
