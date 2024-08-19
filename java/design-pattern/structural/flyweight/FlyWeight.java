package structural.flyweight;

// Flyweight 인터페이스: 공유되는 객체들이 구현해야 하는 공통 인터페이스
public interface FlyWeight {
	void operation(String externalState);
}
