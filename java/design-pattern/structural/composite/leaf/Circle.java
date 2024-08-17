package structural.composite.leaf;

import structural.composite.Graphic;

// 리프(Leaf) - 기본 요소
public class Circle implements Graphic {
	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}
