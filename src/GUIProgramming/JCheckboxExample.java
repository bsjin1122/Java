import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckboxExample {
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("JCheckbox Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JCheckBox 생성
        JCheckBox checkBox = new JCheckBox("Check Me");

        // 체크박스에 ItemListener 등록
        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Checkbox checked!");
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    System.out.println("Checkbox unchecked!");
                }
            }
        });

        // 체크박스를 프레임에 추가
        frame.add(checkBox);

        // 프레임을 표시
        frame.setVisible(true);
    }
}
