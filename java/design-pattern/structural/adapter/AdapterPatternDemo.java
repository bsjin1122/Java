package structural.adapter;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "song.mp3");
		audioPlayer.play("mp4", "movie.mp4");
		audioPlayer.play("vlc", "show.vlc");
		audioPlayer.play("avi", "unknown.avi");
	}
}
