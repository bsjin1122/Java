package creational.factoryMethod.concreteCreator;

import creational.factoryMethod.creator.CoffeeShop;
import creational.factoryMethod.product.Coffee;
import creational.factoryMethod.product.Latte;

public class LatteFactory extends CoffeeShop {
	@Override
	public Coffee createCoffee() {
		return new Latte();
	}
}
