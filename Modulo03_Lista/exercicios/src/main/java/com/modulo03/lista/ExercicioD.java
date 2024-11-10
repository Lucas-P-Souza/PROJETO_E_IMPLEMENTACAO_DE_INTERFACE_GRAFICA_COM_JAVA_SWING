package com.modulo03.lista;

import javax.swing.*;

public class ExercicioD extends JPanel {

    private JLabel label;
    private JCheckBox checkBoxAzul;
    private JCheckBox checkBoxPreto;
    private JCheckBox checkBoxAmarelo;
    private JCheckBox checkBoxVerde;

    public ExercicioD() {
        
        setLayout(null);

        label();
        checkBoxes();
    }

    public void label() {
        label = new JLabel("Cores preferidas: ");
        label.setBounds(10, 5, 300, 20);
        add(label);
    }

    public void checkBoxes() {
        // Criando as checkboxes com os textos à esquerda
        checkBoxAzul = new JCheckBox("Azul");
        checkBoxAzul.setBounds(110, 5, 50, 20);
        add(checkBoxAzul);

        checkBoxPreto = new JCheckBox("Preto");
        checkBoxPreto.setBounds(170, 5, 60, 20);
        add(checkBoxPreto);

        checkBoxAmarelo = new JCheckBox("Amarelo");
        checkBoxAmarelo.setBounds(230, 5, 75, 20);
        add(checkBoxAmarelo);

        checkBoxVerde = new JCheckBox("Verde");
        checkBoxVerde.setBounds(305, 5, 100, 20);
        add(checkBoxVerde);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ExercicioD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 100);

        ExercicioD exercicioD = new ExercicioD();
        frame.add(exercicioD);

        frame.setVisible(true);
    }
}
