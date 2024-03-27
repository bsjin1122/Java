import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Main extends JFrame{

    public Main(){
        setTitle("500 * 300 프레임 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 오른쪽 상단의 종료 버튼이 클릭될 때 프로그램을 종료시킵니다.
        setSize(800, 500);

        Container contentPane = getContentPane(); //프레임에서 컨텐트팬 받아오기
        setVisible(true); // 화면에 프레임 출력
    }

    public static void main(String[] args) {
        // GUI 컴포넌트 생성
        Main main = new Main();
        UploadExcelFile upload = new UploadExcelFile();
        upload.uploadButton.setPreferredSize(new Dimension(100, 50));
        upload.uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 파일 선택 대화상자 생성
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                }
            }
        });

        main.getContentPane().add(upload.uploadButton);
        main.setVisible(true);
    }
}
