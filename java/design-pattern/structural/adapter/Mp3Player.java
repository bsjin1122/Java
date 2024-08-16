package structural.adapter;

// 2. 기존 클래스
public class Mp3Player implements MediaPlayer{
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing mp3 file. Name: " + fileName);
		} else{
			System.out.println("Invalid media. " + audioType + " format not supported");
		}
	}
}
