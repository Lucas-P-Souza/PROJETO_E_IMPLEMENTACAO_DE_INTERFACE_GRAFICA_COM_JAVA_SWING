package com.cadastro.programador;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Sexo extends JPanel {

    private JLabel title;
    private JRadioButton masculinoLabel;
    private JRadioButton femininoLabel;

    public Sexo() {
        
        setLayout(null);

        title();
        sexo();
    }

    private void title() {
        title = new JLabel("Sexo:");
        title.setBounds(10, 0, 100, 20);
        add(title);
    }

    private void sexo() {
        
        masculinoLabel = new JRadioButton("Masculino");
        masculinoLabel.setBounds(50, 0, 85, 20);
        add(masculinoLabel);
        
        femininoLabel = new JRadioButton("Feminino");
        femininoLabel.setBounds(135, 0, 100, 20); 
        add(femininoLabel);

    }
}
