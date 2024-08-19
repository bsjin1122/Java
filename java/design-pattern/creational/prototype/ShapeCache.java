package creational.prototype;

import java.util.HashMap;
import java.util.Map;

// ShapeCache 클래스: 프로토타입 패턴을 구현한 캐시 클래스입니다.
// shapeMap에 저장된 기존 객체를 복제하여 반환하는 메서드와, 초기 캐시 데이터를 로드하는 메서드를 제공
class ShapeCache {
	// shapeMap: Shape 객체들을 저장하는 캐시(Map).
	private static Map<String, Shape> shapeMap = new HashMap<String, Shape>();

	// getShape: 주어진 shapeId에 해당하는 객체를 복제하여 반환합니다.
	public static Shape getShape(String shapeId){
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	// loadCache: Shape 객체들을 생성하고 캐시에 저장합니다.
	public static void loadCache(){
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(), rectangle);
	}


}
