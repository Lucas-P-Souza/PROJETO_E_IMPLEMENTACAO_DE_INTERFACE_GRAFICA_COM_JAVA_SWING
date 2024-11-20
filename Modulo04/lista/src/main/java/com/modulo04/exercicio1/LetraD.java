package com.modulo04.exercicio1;

import javax.swing.*;
import java.awt.*;

public class LetraD {

    public LetraD() {
        JFrame frame = new JFrame("Teste");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addComponentsToPane(frame.getContentPane());
        frame.pack();
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void addComponentsToPane(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        addAButton("Botão 1", pane);
        addAButton("Botão 2", pane);
        addAButton("Botão 3", pane);
        addAButton("Botão 4", pane);
        addAButton("Botão 5", pane);
    }

    private static void addAButton(String text, Container container) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }
}
