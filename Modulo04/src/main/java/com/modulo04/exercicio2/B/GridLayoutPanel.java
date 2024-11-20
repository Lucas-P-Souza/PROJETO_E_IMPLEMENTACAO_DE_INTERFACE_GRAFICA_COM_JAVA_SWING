package com.modulo04.exercicio2.B;

import java.awt.Color;
import javax.swing.*;

public class GridLayoutPanel extends JPanel {

    public GridLayoutPanel() {
        setLayout(new java.awt.GridLayout(2, 2, 10, 10));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        add(new Tpa());
        add(new Tpa());
        add(new Tpa());
        add(new Tpa());
    }

    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(800, 500);
        janela.add(new GridLayoutPanel());
        janela.setVisible(true);
    }
}
