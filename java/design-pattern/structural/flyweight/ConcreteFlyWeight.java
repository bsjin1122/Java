package structural.flyweight;

public class ConcreteFlyWeight implements FlyWeight{
	private String internalState; // 내부 상태 (공유되는 상태)

	// 생성자: 내부 상태를 초기화
	public ConcreteFlyWeight(String internalState) {
		this.internalState = internalState;
	}

	@Override
	public void operation(String externalState) {
		System.out.println("InternalState: " + internalState + ", ExternalState: " + externalState);
	}
}
