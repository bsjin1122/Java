package structural.composite.composite;

import java.util.ArrayList;
import java.util.List;

import structural.composite.Graphic;

public class CompositeGraphic implements Graphic {
	private List<Graphic> childGraphics = new ArrayList<>();

	
	// 하나씩 draw 실행
	@Override
	public void draw() {
		for (Graphic childGraphic : childGraphics) {
			childGraphic.draw();
		}
	}


	// 복합체에 그래픽 요소를 추가
	public void add(Graphic graphic){
		childGraphics.add(graphic);
	}

	// 복합체에서 그래픽 요소를 제거
	public void remove(Graphic graphic){
		childGraphics.remove(graphic);
	}
}
