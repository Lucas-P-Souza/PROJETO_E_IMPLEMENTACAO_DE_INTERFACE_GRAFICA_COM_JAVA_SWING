package com.modulo04.exercicio1;

import java.awt.GridLayout;
import javax.swing.*;

public class LetraC extends JFrame{

    public LetraC() {
        
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));
        add(new JButton("um"));
        add(new JButton("dois"));
        add(new JButton("três"));
        add(new JButton("quatro"));
        add(new JButton("quinto"));
        setVisible(true);
        
    }
}
