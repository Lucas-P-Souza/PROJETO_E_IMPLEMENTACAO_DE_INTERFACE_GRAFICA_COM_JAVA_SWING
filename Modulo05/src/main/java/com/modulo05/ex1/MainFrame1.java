package com.modulo05.ex1;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class MainFrame1 extends JFrame {

    public MainFrame1() {

        setLayout(new BorderLayout());
        setTitle("Exercício 1");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(new Dimension(400, 550));

        ColorPanel colorPanel = new ColorPanel(Color.WHITE);
        add(colorPanel, BorderLayout.CENTER);

        ButtonsPanel buttonsPanel = new ButtonsPanel(colorPanel);
        add(buttonsPanel, BorderLayout.NORTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
