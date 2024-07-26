import javax.swing.*;
import java.awt.*; // 컨테이너 클래스 추가
// 제목창 아래의 컨테이너 공간을 말한다. 버튼과 같은 컴포넌트들이 부착된다.

public class TestFrame extends JFrame {
    public TestFrame(){
        setTitle("500 * 300 프레임 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 오른쪽 상단의 종료 버튼이 클릭될 때 프로그램을 종료시킵니다.
        setSize(800, 500);

        Container contentPane = getContentPane(); //프레임에서 컨텐트팬 받아오기
        setVisible(true); // 화면에 프레임 출력
    }

    public static void main(String[] args) {
        TestFrame mf = new TestFrame();
    }
}
