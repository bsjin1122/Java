package structural.composite.leaf;

import structural.composite.Graphic;

public class Square implements Graphic {
	@Override
	public void draw() {
		System.out.println("Drawing a Square");
	}
}
