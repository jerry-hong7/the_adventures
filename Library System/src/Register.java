import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.*;

public class Register implements ActionListener {
    JFrame frame = new JFrame();
    JLabel userLabel = new JLabel("NEW USERNAME");
    JLabel passwordLabel = new JLabel("NEW PASSWORD");
    JLabel messageLabel = new JLabel();
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton regButton = new JButton("REGISTER");
    JButton loginButton = new JButton("LOGIN");
    HashMap<String, String> loginInfo;

    public Register() {
        loginInfo = new HashMap<String, String>();

        frame.setTitle("Register: OxLibrary");
        frame.setBounds(10, 10, 370, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(userLabel);
        frame.add(passwordLabel);
        frame.add(userTextField);
        frame.add(passwordField);
        frame.add(regButton);
        frame.add(loginButton);
        frame.add(messageLabel);

        loginButton.addActionListener(this);
        regButton.addActionListener(this);

        userLabel.setBounds(50, 100, 100, 30);
        passwordLabel.setBounds(50, 170, 100, 30);
        messageLabel.setBounds(25,350,350,30);
        userTextField.setBounds(150, 100, 150, 30);
        passwordField.setBounds(150, 170, 150, 30);
        loginButton.setBounds(50, 250, 100, 30);
        regButton.setBounds(175, 250, 100, 30);
    }

    protected HashMap getLoginInfo() {
        return loginInfo;
    }

    public boolean checkPassword(String password) {
        boolean uppercase = false;
        boolean lowercase = false;
        boolean length = false;
        boolean hasNum = false;
        boolean valid = true;

        if (password.length() >= 8) {
            length = true;
        }
        for (int a = 0; a < password.length(); a++) {
            if (Character.isUpperCase(password.charAt(a))) {
                uppercase = true;
            }
        }
        for (int b = 0; b < password.length(); b++) {
            if (Character.isLowerCase(password.charAt(b))) {
                lowercase = true;
            }
        }
        for (int c = 0; c < password.length(); c++) {
            if (Character.isDigit(password.charAt(c))) {
                hasNum = true;
            }
        }
        if (!length) {
            messageLabel.setText("Password is too short. At least 8 characters");
            valid = false;
        }
        if (!uppercase) {
            messageLabel.setText("Password does not have an uppercase letter.");
            valid = false;
        }
        if (!lowercase) {
            messageLabel.setText("Password does not have a lowercase letter.");
            valid = false;
        }
        if (!hasNum) {
            messageLabel.setText("Password does not have a digit.");
            valid = false;
        }
        return valid;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == regButton) {
            String userID = userTextField.getText();
            String password = String.valueOf(passwordField.getPassword());
            if(checkPassword(password)){
                loginInfo.put(userID, password);
                messageLabel.setText("Registration Successful! Click on LOGIN to proceed");
                userTextField.setText("");
                passwordField.setText("");
            }
            else{
                passwordField.setText("");
            }
        }
        if(e.getSource() == loginButton) {
            frame.dispose();
            Login login = new Login(getLoginInfo());
        }
    }
}
