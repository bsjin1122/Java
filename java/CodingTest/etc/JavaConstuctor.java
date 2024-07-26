package etc;

public class JavaConstuctor {
    public static void main(String[] args) {
        // 클래스의 객체 생성
        A2 a = new A2();
        B b = new B();
        // C c = new C();
        C c = new C(3);

        // 메서드 호출
        a.work();
        b.work();
        c.work();
    }
}
class A2{
    int m;
    void work(){
        System.out.println(m);
    }
    A2(){
        // 객체 생성 이후에 해야 할 추가 일들
    }
}

class B{
    int m;
    void work(){
        System.out.println(m); // 0
    }
    B(){
        // 기본 생성자
    }
}
class C{
    int m;
    void work(){
        System.out.println(m);
    }
    C(int a){
        // 생성자의 기본 기능 : 객체 생성 + 필드 초기화
        m = a;
    }
}
