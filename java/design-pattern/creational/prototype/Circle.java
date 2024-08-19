package creational.prototype;
// Circle 클래스: Shape 클래스를 상속받아 원 객체를 정의합니다.
// draw 메서드를 구현하여 원의 그리기 동작을 정의합니다.
public class Circle extends Shape{
	public Circle() {
		type = "Circle";
	}

	@Override
	void draw() {
		System.out.println("Inside Circle:: draw() method.");
	}
}
