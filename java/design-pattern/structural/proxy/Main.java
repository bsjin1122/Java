package structural.proxy;

public class Main {
	public static void main(String[] args) {
		// Proxy 객체를 생성하고, request 메서드를 호출하여 RealSubject에 대한 작업 수행
		Proxy proxy = new Proxy();
		proxy.request();
	}
}
