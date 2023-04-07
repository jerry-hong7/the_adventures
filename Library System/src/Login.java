import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class Login implements ActionListener {

    JFrame frame = new JFrame();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JLabel messageLabel = new JLabel();
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resButton = new JButton("RESET");
    HashMap<String,String> loginInfo;

    public Login(HashMap<String,String> loginRaw) {
        loginInfo = loginRaw;

        frame.setTitle("Login: OxLibrary");
        frame.setBounds(10, 10, 370, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(userLabel);
        frame.add(passwordLabel);
        frame.add(userTextField);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(resButton);
        frame.add(messageLabel);

        loginButton.addActionListener(this);
        resButton.addActionListener(this);

        userLabel.setBounds(50, 100, 100, 30);
        passwordLabel.setBounds(50, 170, 100, 30);
        messageLabel.setBounds(50,300,300,30);
        userTextField.setBounds(150, 100, 150, 30);
        passwordField.setBounds(150, 170, 150, 30);
        loginButton.setBounds(50, 250, 100, 30);
        resButton.setBounds(200, 250, 100, 30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginButton) {
            String userID = userTextField.getText();
            String password = String.valueOf(passwordField.getPassword());
            if(loginInfo.containsKey(userID)) {
                if(loginInfo.get(userID).equals(password)) {
                    frame.dispose();
                    HomePage homepage = new HomePage();
                }
                else {
                    messageLabel.setText("Username and Password do not match!");
                    userTextField.setText("");
                    passwordField.setText("");
                }
            }
            else {
                messageLabel.setText("Username and Password do not match!");
                userTextField.setText("");
                passwordField.setText("");
            }
        }

        if(e.getSource() == resButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
    }
}