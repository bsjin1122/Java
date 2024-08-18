package structural.decorator;

// 구체적인 데코레이터(Concrete Decorators): 커피에 우유를 추가하는 데코레이터
public class MilkDecorator extends CoffeeDecorator{
	public MilkDecorator(Coffee decoratedCoffee) {
		super(decoratedCoffee);  // 기존 Coffee 객체를 포함시킵니다.
	}

	@Override
	public String getDescription() {
		// 기존 커피 설명에 "Milk"를 추가
		return super.getDescription() + ", Milk";
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.5;
	}
}
