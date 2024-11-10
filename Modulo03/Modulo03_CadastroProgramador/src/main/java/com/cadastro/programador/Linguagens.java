package com.cadastro.programador;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Linguagens extends JPanel {

    private JLabel title;
    private JCheckBox linguagens;

    public Linguagens() {
        setLayout(null);

        title();
        linguagens();
    }

    private void title() {
        title = new JLabel("Linguagens:");
        title.setBounds(10, 0, 100, 20);
        add(title);
    }

    private void linguagens() {
        
        linguagens = new JCheckBox("Java");
        linguagens.setBounds(85, 0, 55, 20);
        add(linguagens);
        
        
        linguagens = new JCheckBox("Python");
        linguagens.setBounds(140, 0, 65, 20); 
        add(linguagens);
        
        
        linguagens = new JCheckBox("C++");
        linguagens.setBounds(205, 0, 50, 20); 
        add(linguagens);

        linguagens = new JCheckBox("Outras");
        linguagens.setBounds(255, 0, 65, 20);
        add(linguagens);
    }

}
