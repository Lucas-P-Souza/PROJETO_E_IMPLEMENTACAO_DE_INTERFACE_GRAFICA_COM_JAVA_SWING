package com.modulo04.exercicio1;

import java.awt.BorderLayout;
import javax.swing.*;

public class LetraB extends JFrame{

    public LetraB() {
        
        setSize(300, 200);
        setLayout(new BorderLayout());
        add(new JButton("Botão 1"), BorderLayout.NORTH);
        add(new JButton("Botão 4"), BorderLayout.SOUTH);
        add(new JButton("Botão 5"), BorderLayout.EAST);
        add(new JButton("Botão 3"), BorderLayout.WEST);
        add(new JButton("Botão 2"), BorderLayout.CENTER);
        setVisible(true);
    }

}
