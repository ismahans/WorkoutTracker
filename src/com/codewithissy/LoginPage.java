package com.codewithissy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    HashMap<String, String> logininfo = new HashMap<String, String>();
    JFrame frame = new JFrame();
    JButton resetButton = new JButton("reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel();


    LoginPage(HashMap<String, String> loginInfoOrginal){
        logininfo = loginInfoOrginal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
