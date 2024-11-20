package com.modulo04.exercicio1;

import java.awt.FlowLayout;
import javax.swing.*;

public class LetraA extends JFrame {

    public LetraA() {

        setSize(300, 200);
        setLayout(new FlowLayout());
        add(new JButton("um"));
        add(new JButton("dois"));
        add(new JButton("três"));
        add(new JButton("quatro"));
        setVisible(true);

    }

}
