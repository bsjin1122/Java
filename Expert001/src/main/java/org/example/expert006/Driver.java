package org.example.expert006;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Driver {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("expert006/expert006.xml");

       Car car = context.getBean("car", Car.class); // 상품을 구매하는 코드.

       //Tire tire = context.getBean("tire", Tire.class);

       //car.setTire(tire);

       System.out.println(car.getTireBrand());
    }
}
// DI는 외부에 있는 의존 대상을 주입하는 것을 말한다.
// 의존 대상을 구현하고 배치할 때, SOLID와 응집도는 높이고, 결합도는 낮추라는기본 원칙에 충실해야 한다.
// 그래야 프로젝트의 구현과 유지보수가 수월해진다.