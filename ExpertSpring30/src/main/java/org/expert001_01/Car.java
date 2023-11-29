package org.expert001_01;

public class Car {
    Tire tire;
    public Car(){
        tire = new KoreaTire(); // 의존관계가 일어나고 있는 부분
        // tire = new AmericaTire();
    }

    public String getTireBrand(){
        return "장착된 타이어 : " + tire.getBrand();
    }
}
