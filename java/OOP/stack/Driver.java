package OOP.stack;

class 펭귄{
    void test(){
        System.out.println("Test");
    }
}
public class Driver {
    public static void main(String[] args) {
        펭귄 뽀로로 = new 펭귄();

        뽀로로.test(); // 자신을 나타내는 this 객체 참조변수를 넘긴다. JVM에 의해 아래와 같이 변경된다고 생각하면 된다.
    }
}
