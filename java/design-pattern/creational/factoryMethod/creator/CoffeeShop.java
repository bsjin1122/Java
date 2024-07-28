package creational.factoryMethod.creator;

import creational.factoryMethod.product.Coffee;

public abstract class CoffeeShop {
	// 팩토리 메서드
	public abstract Coffee createCoffee();
	public Coffee orderCoffee(){
		Coffee coffee = createCoffee();
		coffee.brew();
		return coffee;
	}
}
