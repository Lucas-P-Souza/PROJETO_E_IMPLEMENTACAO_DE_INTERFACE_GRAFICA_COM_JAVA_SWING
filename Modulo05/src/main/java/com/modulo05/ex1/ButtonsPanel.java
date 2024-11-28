package com.modulo05.ex1;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonsPanel extends JPanel {

    public ButtonsPanel(ColorPanel colorPanel) {

        setLayout(new GridBagLayout());

        MyButton yellowButton = new MyButton("Amarelo", Color.YELLOW);
        yellowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.YELLOW);
            }
        });
        
        MyButton greenButton = new MyButton("Verde", Color.GREEN);
        greenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.GREEN);
            }
        });

        MyButton blueButton = new MyButton("Azul", Color.BLUE);
        blueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.BLUE);
            }
        });

        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(yellowButton, gbc);

        gbc.gridx = 1;
        add(greenButton, gbc);

        gbc.gridx = 2;
        add(blueButton, gbc);
    }
}
