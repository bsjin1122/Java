package creational.factoryMethod.concreteCreator;

import creational.factoryMethod.creator.CoffeeShop;
import creational.factoryMethod.product.Cappuccino;
import creational.factoryMethod.product.Coffee;

public class CappuccinoFactory extends CoffeeShop {
	@Override
	public Coffee createCoffee() {
		return new Cappuccino();
	}
}
