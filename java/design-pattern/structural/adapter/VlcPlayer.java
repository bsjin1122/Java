package structural.adapter;
// 4. 호환되지 않는 클래스
public class VlcPlayer implements AdvancedMediaPlayer{
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// 아무것도 하지 않음.
	}
}
