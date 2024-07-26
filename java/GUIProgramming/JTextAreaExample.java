import javax.swing.*;
import java.awt.*;

public class JTextAreaExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextArea Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea(10, 30); // 10행, 30열 크기의 JTextArea 생성
        JScrollPane scrollPane = new JScrollPane(textArea); // 스크롤 가능하도록 JScrollPane에 JTextArea를 포함

        JButton button = new JButton("확인");

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
