package structural.adapter;

// 6. 클라이언트 클래스
public class AudioPlayer implements MediaPlayer{
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		// mp3는 기본적으로 재생할 수 있음.
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing mp3 file. Name: " + fileName);
		}
		// 어댑터를 사용해 다른 형식을 재생
		else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else{
			System.out.println("Invalid media. " + audioType + " format not supported.");
		}
	}
}
