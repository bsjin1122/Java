import javax.swing.*;

public class JListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] fruits = {"Apple", "Banana", "Orange", "Mango", "Grapes"};
        JList<String> list = new JList<>(fruits);

        frame.add(list);
        frame.pack();
        frame.setVisible(true);
    }
}
