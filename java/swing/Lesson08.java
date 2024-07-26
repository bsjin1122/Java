import javax.swing.*;
import java.awt.*;

class ImagePanel extends JPanel {
    private Image image;
    public ImagePanel(Image img){
        this.image = img; // img를 JPanel에 있는 function을 바꿀 예정. 밖에서도 쓸 수 있도록 해줌.
        setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
        setPreferredSize(new Dimension(image.getWidth(null), img.getHeight(null)));
        setLayout(null);

    }

    public void paintComponent(Graphics graphics) {
        // 이미지를 자동으로 패널을 열었을 때 비춰지는..
        graphics.drawImage(image, 0, 0, null);
    }
}
public class Lesson08 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lesson 08");
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        ImagePanel panel = new ImagePanel(new ImageIcon("./image/manggom.png").getImage());
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
