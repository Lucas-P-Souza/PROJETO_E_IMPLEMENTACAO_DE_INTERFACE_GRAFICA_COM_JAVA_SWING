package com.modulo05.ex5;

import javax.swing.JFrame;

public class MainFrame5 extends JFrame {

    public MainFrame5() {
        setTitle("Exercício 5");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(new MyPainel());

        setVisible(true);
    }

}
