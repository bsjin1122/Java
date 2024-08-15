package creational.prototype;

public class PrototypePatternDemo {
	public static void main(String[] args) {
		ShapeCache.loadCache();

		Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape: " + clonedShape1.getType());
		clonedShape1.draw();

		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape: " + clonedShape2.getType());
		clonedShape2.draw();

	}
}
