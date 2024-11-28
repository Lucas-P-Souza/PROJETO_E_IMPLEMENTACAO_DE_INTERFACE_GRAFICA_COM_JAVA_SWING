package com.modulo05.ex2;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class MainFrame2 extends JFrame {

    public MainFrame2() {
        JPanel buttonPanel = new ButtonPainel(this);

        setLayout(new BorderLayout());
        setTitle("Exercício 2");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}
