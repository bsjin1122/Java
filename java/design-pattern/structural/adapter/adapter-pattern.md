# 어댑터 패턴(Adapter Pattern)
- 호환되지 않는 인터페이스를 가진 클래스들이, 서로 함께 동작할 수 있도록 돕는 패턴이다.
- 기존 코드를 변경하지 않고도 인터페이스를 변환해 사용할 수 있게 해준다.
- 이 패턴은 마치 전원 플러그 어댑터처럼, 한 인터페이스를 다른 인터페이스로 변환하는 역할을 한다.

<br>

- MediaPlayer : 인터페이스는 기존에 사용 중이던 인터페이스
- Mp3Player: MediaPlayer를 구현하여, Mp3 파일만 재생할 수 있는 클래스
- AdvancedMediaPlayer: 인터페이스는 새로운 형식의 미디어 파일을 재생하는 클래스들이 구현해야 할 인터페이스
- VlcPlayer와 Mp4Player는 AdvancedMediaPlayer 인터페이스를 구현하여, 각각 VLC와 MP4 파일을 재생할 수 있다.
- MediaAdapter는 MediaPlayer 인터페이스를 구현하여, AdvancedMediaPlayer 인터페이스를 어댑터로 변환
- AudioPlayer는 MediaAdapter를 사용하여, 다양한 형식의 미디어 파일을 재생