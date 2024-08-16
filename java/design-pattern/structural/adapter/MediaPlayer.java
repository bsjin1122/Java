package structural.adapter;

// 1. 기존 클래스와 호환되지 않는 인터페이스
// 기존에 사용 중이던 인터페이스
public interface MediaPlayer {
	void play(String audioType, String fileName);
}
