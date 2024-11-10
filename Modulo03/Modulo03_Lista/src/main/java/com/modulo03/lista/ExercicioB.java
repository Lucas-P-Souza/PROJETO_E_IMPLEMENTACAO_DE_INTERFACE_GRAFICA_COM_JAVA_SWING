package com.modulo03.lista;

import javax.swing.*;

public class ExercicioB extends JPanel {

    private JLabel label;
    private JTextField textField;

    public ExercicioB() {

        label();
        textField();

    }

    public void label() {
        
        label = new JLabel("Nome: ");
        add(label);

    }

    public void textField() {
        
        textField = new JTextField(20);
        add(textField);

    }


    public static void main(String[] args) {

        JFrame frame = new JFrame("ExercicioB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        ExercicioB exercicioB = new ExercicioB();
        frame.add(exercicioB);

        frame.setVisible(true);

    }
}
