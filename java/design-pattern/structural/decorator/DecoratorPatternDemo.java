package structural.decorator;

// 클라이언트 코드
// 데코레이터 패턴을 사용하여 커피에 우유와 설탕을 추가해봅니다.
public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Coffee simpleCoffee = new SimpleCoffee();
		System.out.println(simpleCoffee.getDescription() + " $" + simpleCoffee.getCost());

		Coffee milkCoffee = new MilkDecorator(simpleCoffee);
		System.out.println(milkCoffee.getDescription() + " $" + milkCoffee.getCost());

		Coffee milkAndSugarCoffee = new SugarDecorator(milkCoffee);
		System.out.println(milkAndSugarCoffee.getDescription() + " $" + milkAndSugarCoffee.getCost());
	}
}
