package structural.proxy;
// RealSubject 클래스: 실제 작업을 수행하는 클래스
public class RealSubject implements Subject{
	@Override
	public void request() {
		System.out.println("RealSubject: Handling request");
	}

}
