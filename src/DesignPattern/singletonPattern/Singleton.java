package DesignPattern.singletonPattern;

public class Singleton {
    static Singleton singletonObject; // 단일 객체를 저장하기 위한 정적 참조 변수

    private Singleton(){}; // new를 통해 객체를 생성할 수 없도록 private 생성자를 지정

    // 단일 객체를 반환하기 위한 객체 반환 정적 메서드
    public static Singleton getInstance(){
        if(singletonObject == null){
            singletonObject = new Singleton();
        }
        return singletonObject;
    }
}
