package structural.decorator;

// Decorator 클래스
// Coffee 인터페이스를 구현하면서, 다른 Coffee 객체를 포함합니다.
// 이는 상속 대신 합성을 통해 새로운 기능을 추가할 수 있게 합니다.
abstract class CoffeeDecorator implements Coffee{
	protected Coffee decoratedCoffee; // 합성: 기존 Coffee 객체를 포함

	public CoffeeDecorator(Coffee decoratedCoffee) {
		// 기존 Coffee 객체의 설명을 그대로 반환
		this.decoratedCoffee = decoratedCoffee;
	}

	@Override
	public String getDescription() {
		// 기존 Coffee 객체의 가격을 그대로 반환
		return decoratedCoffee.getDescription();
	}

	@Override
	public double getCost() {
		return decoratedCoffee.getCost();
	}
}
