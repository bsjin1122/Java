package org.expert001_02;

public class Driver {
    public static void main(String[] args) {
        Tire tire = new KoreaTire(); // 운전자가 어떤 타이어를 장착할까 고민하게 한다.
        // Tire tire = new AmericaTire();
        Car car = new Car(tire); // 자동차는 어떤 타이어를 장착할까 더는 고민하지 않아도 된다.

        System.out.println(car.getTireBrand());

    }
}
