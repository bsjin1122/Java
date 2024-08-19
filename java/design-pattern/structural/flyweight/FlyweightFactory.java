package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// FlyweightFactory 클래스: Flyweight 객체를 생성하고 관리하며, 객체의 공유를 책임짐
public class FlyweightFactory {
	// Flyweight 객체들을 저장하는 맵(공유 객체 풀)
	private Map<String, FlyWeight> flyWeights = new HashMap<>();

	// getFlyweight 메서드: 요청된 키에 해당하는 Flyweight 객체를 반환, 없으면 새로 생성
	FlyWeight getFlyweight(String key){
		// Flyweight 객체가 없으면 새로 생성하고, 맵에 추가
		if(!flyWeights.containsKey(key)){
			flyWeights.put(key, new ConcreteFlyWeight(key));
		}
		// 이미 존재하면 맵에서 가져와 반환
		return flyWeights.get(key);
	}
}
