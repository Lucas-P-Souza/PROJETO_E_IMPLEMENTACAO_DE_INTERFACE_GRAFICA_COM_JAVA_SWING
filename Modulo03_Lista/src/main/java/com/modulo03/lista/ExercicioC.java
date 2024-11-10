package com.modulo03.lista;

import javax.swing.*;
import javax.swing.border.Border;

public class ExercicioC extends JPanel {

    private JLabel label;
    private JTextArea textArea;

    public ExercicioC() {
        
        setLayout(null);

        label();
        textArea();

    }

    public void label() {

        label = new JLabel("Faça um resumo de suas atividades profissionais: ");
        label.setBounds(10, 5, 300, 20);
        add(label);

    }

    public void textArea() {

        textArea = new JTextArea(5, 20);
        textArea.setBounds(300, 5, 300, 150);

        Border border = BorderFactory.createLineBorder(java.awt.Color.BLACK); 
        textArea.setBorder(border);

        add(textArea);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("ExercicioC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 200);

        ExercicioC exercicioC = new ExercicioC();
        frame.add(exercicioC);

        frame.setVisible(true);
        
    }
}
