package org.expert001_02;

public class Car {
    Tire tire;
    public Car(Tire tire){ // new가 사라지고, 생성자에 인자가 추가되었다.
        this.tire = tire;
    }

    public String getTireBrand(){
        return "장착된 타이어 : " + tire.getBrand();
    }
}
