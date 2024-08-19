package structural.proxy;

public class Proxy implements Subject{
	private RealSubject realSubject;
	@Override
	public void request() {
		// RealSubject 객체를 필요할 때까지 생성하지 않고, 요청이 있을 떄만 생성
		if(realSubject == null){
			realSubject = new RealSubject();
		}
		// RealSubject에 대한 작업 전후에 추가적인 기능(예: 로깅) 수행
		System.out.println("Proxy: Logging access before forward request.");
		realSubject.request();
	}
}
