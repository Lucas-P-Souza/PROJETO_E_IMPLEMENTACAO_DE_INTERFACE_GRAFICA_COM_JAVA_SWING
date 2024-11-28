package com.modulo05.ex2;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonPainel extends JPanel {

    public ButtonPainel(final JFrame frame) {

        setLayout(new GridBagLayout());

        JButton javaButton = new JButton("Java");
        JButton javaScriptButton = new JButton("JavaScript");
        JButton pythonButton = new JButton("Python");
        JButton cPlusPlusButton = new JButton("C++");
        JButton cSharpButton = new JButton("C#");
        JButton cButton = new JButton("C");

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new java.awt.Insets(10, 10, 10, 10); // Adiciona espaço entre os botões

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(javaButton, gbc);

        gbc.gridx = 1;
        add(javaScriptButton, gbc);

        gbc.gridx = 2;
        add(pythonButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(cPlusPlusButton, gbc);

        gbc.gridx = 1;
        add(cSharpButton, gbc);

        gbc.gridx = 2;
        add(cButton, gbc);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setTitle(e.getActionCommand());
            }
        };

        javaButton.addActionListener(actionListener);
        javaScriptButton.addActionListener(actionListener);
        pythonButton.addActionListener(actionListener);
        cPlusPlusButton.addActionListener(actionListener);
        cSharpButton.addActionListener(actionListener);
        cButton.addActionListener(actionListener);
    }
}
