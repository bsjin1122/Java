import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonExample {
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("JButton Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JButton 생성
        JButton button = new JButton("Click Me");

        // 버튼에 ActionListener 등록
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        // 버튼을 프레임에 추가
        frame.add(button);

        // 프레임을 표시
        frame.setVisible(true);
    }
}
