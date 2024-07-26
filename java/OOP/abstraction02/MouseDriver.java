package OOP.abstraction02;

import OOP.abstraction02.Mouse;

public class MouseDriver {
    public static void main(String[] args) {
        // 클래스명.countOfTail
        Mouse.countOfTail = 1;

        Mouse mickey = new Mouse();
        Mouse jerry = new Mouse();
        Mouse mightyMouse = new Mouse();

        // 객체명.countOfTail
        System.out.println(mickey.countOfTail);
        System.out.println(jerry.countOfTail);
        System.out.println(mightyMouse.countOfTail);
        System.out.println("-------------");
        // 클래스명.countOfTail
        System.out.println(Mouse.countOfTail);
    }
}
