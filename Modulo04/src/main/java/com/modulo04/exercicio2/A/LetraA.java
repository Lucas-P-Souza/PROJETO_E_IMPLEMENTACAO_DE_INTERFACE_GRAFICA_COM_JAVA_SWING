package com.modulo04.exercicio2.A;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class LetraA {

    public LetraA() {

        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setLayout(new GridLayout(1, 2, 50, 50));
        janela.setSize(800, 500);
        janela.add(new EsquerdaA());
        janela.add(new DireitaA());
        janela.setVisible(true);
        
    }

}
