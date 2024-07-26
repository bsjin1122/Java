import javax.swing.*;
import java.awt.*;

public class CenteredLabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Centered Label Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // GridBagLayout을 사용하는 JPanel 생성
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // JLabel 객체 생성 및 제목 설정
        JLabel label = new JLabel("Welcome to My Application");
        label.setHorizontalAlignment(JLabel.CENTER); // 가로 중앙 정렬

        // JLabel을 JPanel에 추가
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1; // 가로 가중치 설정
        gbc.weighty = 1; // 세로 가중치 설정
        gbc.fill = GridBagConstraints.BOTH; // 가로/세로 방향으로 채우기
        panel.add(label, gbc);

        // JPanel을 JFrame에 추가
        frame.add(panel);

        // 윈도우 가시성 설정
        frame.setVisible(true);
    }
}
