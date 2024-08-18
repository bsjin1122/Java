package structural.decorator;

// 구체적인 데코레이터 (Concrete Decorators): 커피에 설탕을 추가하는 데코레이터
public class SugarDecorator extends CoffeeDecorator{
	public SugarDecorator(Coffee decoratedCoffee) {
		super(decoratedCoffee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Sugar";
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.2;
	}
}
