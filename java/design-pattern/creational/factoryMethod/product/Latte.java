package creational.factoryMethod.product;

public class Latte extends Coffee{

	@Override
	public void brew() {
		System.out.println("Brewing a cup of Latte");
	}
}
