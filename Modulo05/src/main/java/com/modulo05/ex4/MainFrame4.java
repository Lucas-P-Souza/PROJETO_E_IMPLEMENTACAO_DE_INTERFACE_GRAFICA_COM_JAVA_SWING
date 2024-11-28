package com.modulo05.ex4;

import javax.swing.*;

public class MainFrame4 extends JFrame {

    public MainFrame4() {
        setTitle("Exercício 4");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);

        // Adiciona o painel
        MyPanel mainPanel = new MyPanel();
        add(mainPanel);

        // Torna a janela visível
        setVisible(true);
    }

}
