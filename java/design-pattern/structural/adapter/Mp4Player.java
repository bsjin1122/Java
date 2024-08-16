package structural.adapter;

// 4. 호환되지 않는 클래스
public class Mp4Player implements AdvancedMediaPlayer{
	@Override
	public void playVlc(String fileName) {
		// 아무것도 하지 않음
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}
}
