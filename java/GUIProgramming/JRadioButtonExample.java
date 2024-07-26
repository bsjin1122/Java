import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonExample {
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("JRadioButton Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JRadioButton 생성
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");

        // ButtonGroup 생성 및 라디오 버튼 추가
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        // ActionListener 등록
        ActionListener radioButtonListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Selected: " + ((JRadioButton) e.getSource()).getText());
            }
        };
        radioButton1.addActionListener(radioButtonListener);
        radioButton2.addActionListener(radioButtonListener);

        // 라디오 버튼들을 프레임에 추가
        frame.add(radioButton1);
        frame.add(radioButton2);

        // 프레임을 표시
        frame.setVisible(true);
    }
}
