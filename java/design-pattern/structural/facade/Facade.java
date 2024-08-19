package structural.facade;

// Facade 클래스: SubsystemA와 SubsystemB를 감싸서 단순한 인터페이스를 제공합니다.
public class Facade {
	// 캡슐화를 통해서 외부에서 직접 접근하지 못하게 함.
	// 복잡성 감소 / 변경 용이성 / 일관된 접근(Facade를 통해서만 서브시스템에 접근하게 함)
	private SubsystemA a = new SubsystemA();
	private SubsystemB b = new SubsystemB();

	// operation 메서드: SubsystemA와 SubsystemB의 기능을 한꺼번에 호출하여 외부에서 쉽게 사용할 수 있게 합니다.
	void operation(){
		a.operationA();
		b.operationB();
	}

}
