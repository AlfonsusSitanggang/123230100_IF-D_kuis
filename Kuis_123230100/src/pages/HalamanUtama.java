package pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HalamanUtama extends JFrame {
    private JTextField firstNameField;
    private JComboBox<String> divisionComboBox;
 
    private JButton saveButton;
    private final String username;
    
    public HalamanUtama(String username) {
        this.username = username;
        setTitle("SelamaT Datang" + username);
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JLabel firstNameLabel = new JLabel("Daftar Barang:");
        firstNameField = new JTextField(20);
        
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(null);
        
        firstNameLabel.setBounds(20, 20, 100, 25);
        firstNameField.setBounds(20, 40, 300, 25);
        

        saveButton.setBounds(130, 170, 150, 30);
        inputPanel.add(saveButton);
        inputPanel.setPreferredSize(new Dimension(700, 220));
        

        setVisible(true) ;
       
    }
    
    public HalamanUtama() {
        this("Unknown");
    }

    @Override
     
    }
    
    

}