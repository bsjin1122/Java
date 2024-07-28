package creational.factoryMethod;

import creational.factoryMethod.concreteCreator.CappuccinoFactory;
import creational.factoryMethod.concreteCreator.LatteFactory;
import creational.factoryMethod.creator.CoffeeShop;
import creational.factoryMethod.product.Coffee;

/* [팩토리 메서드 패턴]
- 객체 생성의 책임을 서브클래스로 전가하여, 객체 생성 과정을 캡슐화하는 디자인 패턴
- 객체 생성 코드를 변경하지 않고도 새로운 종류의 객체를 쉽게 추가할 수 있다.

* 언제 사용?
- 객체 생성 로직이 복잡, 특정 조건에 따라 다른 객체를 생성해야 하는 경우에 특히 유용하다.
*/
public class FactoryMethod {
	public static void main(String[] args) {
		CoffeeShop latteFactory = new LatteFactory();
		Coffee latte = latteFactory.orderCoffee();

		CoffeeShop cappuccinoFactory = new CappuccinoFactory();
		Coffee cappuccino = cappuccinoFactory.orderCoffee();
	}
}
