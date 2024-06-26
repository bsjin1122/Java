import javax.management.remote.JMXConnectorFactory;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    public Login(){
        JPanel panel = new JPanel();
        JLabel label = new JLabel("ID : ");
        JLabel pswrd = new JLabel("Password : ");
        JTextField txtID = new JTextField(10);
        JPasswordField txtPass = new JPasswordField(10);
        JButton logBtn = new JButton("Log In");

        panel.add(label);
        panel.add(txtID);
        panel.add(pswrd);
        panel.add(txtPass);
        panel.add(logBtn);
        logBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = "Dan";
                String pass = "1234";
                if(id.equals(txtID.getText())&& pass.equals(txtPass.getText())){
                    JOptionPane.showMessageDialog(null, "You have logged In successfully");
                }else{
                    JOptionPane.showMessageDialog(null, "You failed to log in");
                }
            }
        });
        add(panel);

        setVisible(true);
        setSize(600,400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Login();
    }
}
