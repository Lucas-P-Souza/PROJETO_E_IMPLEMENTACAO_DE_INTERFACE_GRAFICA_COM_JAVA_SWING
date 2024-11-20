package com.modulo04.exercicio2.B;

import javax.swing.JFrame;

public class LetraB {

    public LetraB() {

        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(800, 500);
        janela.add(new BorderLayoutPanel());
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);

    }

}
