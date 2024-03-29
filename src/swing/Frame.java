import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("some txt");
        JButton btn1 = new JButton("Click me!");
        JButton btn2 = new JButton("Exit!");
        JTextArea txtArea = new JTextArea();
        JTextField txtField = new JTextField();
        JPanel btnPanel = new JPanel();
        panel.setLayout(new BorderLayout());
        btnPanel.add(btn1);
        btnPanel.add(btn2);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { // 클릭하였을 때 무언가를 해라
                // 버튼에 기능을 추가
                //txtArea.append("You are amazing\n");
                label.setText(txtArea.getText());
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panel.add(label, BorderLayout.NORTH);
        panel.add(btnPanel, BorderLayout.WEST);
        panel.add(txtArea, BorderLayout.CENTER);

        frame.add(panel);


        frame.setResizable(false);
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(840, 840/12*9));
        frame.setSize(840, 840/12*9);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Frame 시작하는 데 하나의 툴
        // Panel 여기에 무엇을 넣고싶은지 --> 여러가지 기능을 나눠서 넣을 때.

    }
}
