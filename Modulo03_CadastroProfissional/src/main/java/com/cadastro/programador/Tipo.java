package com.cadastro.programador;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tipo extends JPanel {

    private JLabel title;
    private JComboBox<String> tipo;  // Especifica que o JComboBox é de tipo String

    public Tipo() {
        setLayout(null);

        title();
        tipo();
    }

    private void title() {
        title = new JLabel("Tipo: ");
        title.setBounds(10, 5, 200, 20);
        add(title);
    }

    private void tipo() {
        String[] tipos = {"Back-end", "Front-end"};
        tipo = new JComboBox<>(tipos);  // Passa o array de String como argumento
        tipo.setBounds(10, 30, 200, 20);
        add(tipo);
    }
}
