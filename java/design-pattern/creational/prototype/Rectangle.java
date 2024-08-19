package creational.prototype;
// Rectangle 클래스: Shape 클래스를 상속받아 사각형 객체를 정의합니다.
// draw 메서드를 구현하여 사각형의 그리기 동작을 정의합니다.
public class Rectangle extends Shape{
	// 생성자: Rectangle 객체의 타입을 "Rectangle"으로 설정합니다.
	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	void draw() {
		System.out.println("Inside Rectangel:: deaw() method.");
	}
}
