package org.edu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Login extends JFrame implements ActionListener {

    JLabel usernameLbl, passwordLbl;
    JTextField usernameTf;
    JPasswordField passwordPf;
    JButton loginBtn, registerBtn;

    public Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("Login");

        usernameLbl = new JLabel("Username");
        usernameLbl.setBounds(450, 300, 100, 30);
        usernameLbl.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(usernameLbl);

        passwordLbl = new JLabel("Password");
        passwordLbl.setBounds(450, 350, 100, 30);
        passwordLbl.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(passwordLbl);

        usernameTf = new JTextField();
        usernameTf.setBounds(600, 300, 150, 30);
        usernameTf.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(usernameTf);

        passwordPf = new JPasswordField();
        passwordPf.setBounds(600, 350, 150, 30);
        passwordPf.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(passwordPf);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(480, 400, 100, 30);
        loginBtn.addActionListener(this);
        add(loginBtn);

        registerBtn = new JButton("Register");
        registerBtn.setBounds(620, 400, 100, 30);
        registerBtn.addActionListener(this);
        add(registerBtn);

        setVisible(true);
        setSize(1650, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == loginBtn) {
            String username = usernameLbl.getText();
            char[] password = passwordPf.getPassword();
            if (!username.equals("") && (password.length != 0)) {
                if (Arrays.equals("1234".toCharArray(), password)) {
                    JOptionPane.showMessageDialog(null, "Login Successfully");
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid credentials");  
                }
            }else{
                JOptionPane.showMessageDialog(null, "Fields cannot be empty ");
            }
        } else if (ae.getSource() == registerBtn) {
                new Registration();
                setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }

}
