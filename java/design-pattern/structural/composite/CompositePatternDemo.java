package structural.composite;

import structural.composite.composite.CompositeGraphic;
import structural.composite.leaf.Circle;
import structural.composite.leaf.Square;

public class CompositePatternDemo {
	public static void main(String[] args) {
		// 리프 객체 생성
		Graphic circle = new Circle();
		Graphic square = new Square();

		// 복합체 객체 생성
		CompositeGraphic composite = new CompositeGraphic();
		composite.add(circle);
		composite.add(square);

		// 복합체를 그리기
		composite.draw(); // circle과 square를 그리게 됨
	}
}
