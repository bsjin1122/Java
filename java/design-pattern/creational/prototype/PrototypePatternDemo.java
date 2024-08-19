package creational.prototype;
// PrototypePatternDemo 클래스: 프로토타입 패턴을 사용하는 클라이언트 코드입니다.
// ShapeCache에서 복제된 Shape 객체들을 가져와 사용하는 예시를 보여줍니다.
public class PrototypePatternDemo {
	public static void main(String[] args) {
		ShapeCache.loadCache();  // 캐시 로드: Shape 객체들을 캐시에 로드합니다.

		// Shape 객체 복제: "1" ID의 객체(Circle)를 복제하여 사용.
		Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape: " + clonedShape1.getType());
		clonedShape1.draw();

		// Shape 객체 복제: "2" ID의 객체(Rectangle)를 복제하여 사용.
		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape: " + clonedShape2.getType());
		clonedShape2.draw();

	}
}
