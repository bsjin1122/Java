import javax.swing.*;
import java.awt.*;

public class ButtonSizeExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Size Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // JPanel 생성 및 FlowLayout 설정
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // JButton 객체 생성
        JButton button = new JButton("Click Me");

        // 버튼 크기 설정
        button.setPreferredSize(new Dimension(100, 50)); // 너비: 100, 높이: 50

        // JButton을 JPanel에 추가
        panel.add(button);

        // JPanel을 JFrame에 추가
        frame.add(panel);

        // 윈도우 가시성 설정
        frame.setVisible(true);
    }
}
