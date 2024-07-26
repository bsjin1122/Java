package OOP.Super;

class 동물{
    void method(){
        System.out.println("동물");
    }
}
class 조류 extends 동물{
    void method(){
        super.method();
        System.out.println("조류");
    }
}
class 펭귄 extends 조류{
    void method(){
        super.method();
        System.out.println("펭귄");
    }
    // Syntax error on token "super", Identifier expected
    // super.super.method(); 상위의 상위 클래스의 인스턴스에는 접근이 불가하다.
}
public class Driver {
    public static void main(String[] args) {
        펭귄 뽀로로 = new 펭귄();
        뽀로로.method();
    }
}
