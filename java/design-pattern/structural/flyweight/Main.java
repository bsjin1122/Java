package structural.flyweight;

public class Main {
	public static void main(String[] args) {
		// FlyweightFactory 인스턴스를 생성
		FlyweightFactory factory = new FlyweightFactory();

		// Flyweight 객체를 팩토리에서 가져옴 (공유 객체를 사용)
		FlyWeight flyweight1 = factory.getFlyweight("A");
		FlyWeight flyweight2 = factory.getFlyweight("B");
		FlyWeight flyweight3 = factory.getFlyweight("A"); // 이미 존재하는 "A" 객체를 재사용

		// Flyweight 객체의 operation 메서드를 호출 (외부 상태를 전달)
		flyweight1.operation("State1");
		flyweight2.operation("State2");
		flyweight3.operation("State3");// flyweight1과 동일한 객체이지만 다른 외부 상태 사용

		// InternalState: A, ExternalState: State1
		// InternalState: B, ExternalState: State2
		// InternalState: A, ExternalState: State3
	}
}
