package DesignPattern.adapterPattern;

public class AdapterServiceA {
    ServiceA sa1 = new ServiceA(); // 객체를 속성으로 만들어 참조하는 디자인패턴

    void runService(){
        sa1.runServiceA();
    }
}
