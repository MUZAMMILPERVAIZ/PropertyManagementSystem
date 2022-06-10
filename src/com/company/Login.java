package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JPanel loginView;
    private JLabel username;
    private JTextField usernametf;
    private JLabel password;
    private JPasswordField passwordtf;
    private JButton loginButton;
    Login(){
        setContentPane(loginView);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setSize(500,500);
        setVisible(true);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((usernametf.getText().equals("admin"))&&(  String.valueOf(passwordtf.getPassword()).equals("admin"))){
                    JOptionPane.showMessageDialog(null, "You are signing in as admin.....");
                    setVisible(false);
                    new Dashboard();
                }
                else {
                    JOptionPane.showMessageDialog(null, "UserName or Password is Incorrect");
                }


            }
        });
    }

    public static void main(String[] args) {
        Login login = new Login();
    }

}
