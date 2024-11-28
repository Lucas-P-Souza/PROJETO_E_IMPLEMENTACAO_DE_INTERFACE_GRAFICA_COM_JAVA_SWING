package com.modulo05.ex3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class MainFrame3 extends JFrame {

    private JTextField textField;

    public MainFrame3() {

        textField = new JTextField(20);

        JButton button = new JButton("ENVIAR");
        button.addActionListener(e -> {
            String text = textField.getText();
            JOptionPane.showMessageDialog(this, text);
        });

        setLayout(new FlowLayout());
        add(textField);
        add(button);
        
        setTitle("Exercício 3");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
