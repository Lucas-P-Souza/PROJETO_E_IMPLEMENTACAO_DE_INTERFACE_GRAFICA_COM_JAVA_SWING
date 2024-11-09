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
        // Criação do botão de rádio Masculino, posicionado à direita do título
        masculinoLabel = new JRadioButton("Masculino");
        masculinoLabel.setBounds(50, 0, 85, 20);  // Posição à direita do título
        add(masculinoLabel);
        
        // Criação do botão de rádio Feminino, posicionado à direita do botão Masculino
        femininoLabel = new JRadioButton("Feminino");
        femininoLabel.setBounds(135, 0, 100, 20);  // Posição à direita de "Masculino"
        add(femininoLabel);
    }
}
