package pages;

import java.awt.PopupMenu;
import  javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;

public class HalamanLogin extends JFrame {
    private JtextField usernameField;
    private JPaswordField PasswordField;
    private JButton LoginButton;
    setVisible(true) ;
    public HalamanLogin(){
        setTitle("Halaman Login");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        JLabel labelUsername = new JLabel ("Username :");
        usernameField = new JTextField();
        JLabel labelPassword = new JLabel ("Password :");
        JPasswordField = new JPasswordField();
        JButton loginButton = new JButton("login");
        
        labelUsername.setBounds(20, 20, 80, 20);
        usernameField.setBounds(100, 20, 100, 20);
        labelPasword.setBounds(20, 50, 80, 20);
        passwordField.setBounds(100, 50, 100, 20);
        loginButton.setBounds(100, 90, 100,30);
        
        add(labelUsername);
        add(usernameField);
        add(labelPassword);
        add(passwordField);
        add(LogginButton);
    }
    
    loginButton.addActionListener (new ActionListener(){
        @Override
        
        public void actionPerformed(ActioEvent a){
        string username = usernameField.getText();
        string password = new String(passwordField.getPassword());       
        
        if(username.equalsIgnoreCase("pbo")) && password.equalsignoreCase90("if-d"){      
            JOptionPane.showMessageDialog(HalamanLogin.this, "Login Berhasil");      
            newHalamanUtama().setVisible(true);        
            dispose();   
        }else {      
            JOptionPane.showMessageDialog(HalamanLogin.this,"Error", JOptionPane.ERROR>Message);   
        }
    }
        return null;
    
    };
   
    
    
    
}
