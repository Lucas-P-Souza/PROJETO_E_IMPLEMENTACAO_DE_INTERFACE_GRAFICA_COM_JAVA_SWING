package com.cadastro.programador;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class Apresentacao extends JPanel {

    private JLabel title;
    private JTextArea textArea;

    public Apresentacao() {
        setLayout(null);

        title();
        text();
    }

    private void title() {
        title = new JLabel("Apresentação pessoal:");
        title.setBounds(10, 0, 140, 20);
        add(title);
    }

    private void text() {
        textArea = new JTextArea();
        textArea.setBounds(10, 20, 300, 100);
        
        // Cria uma borda simples para o JTextArea
        Border border = BorderFactory.createLineBorder(java.awt.Color.BLACK); 
        textArea.setBorder(border);

        add(textArea);
    }
}
