package com.modulo03.lista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ExercicioE extends JPanel {

    private JLabel label;
    private JRadioButton radioButtonM;
    private JRadioButton radioButtonF;

    public ExercicioE() {

        setLayout(null);

        label();
        radioButton();

    }

    public void label() {
        
        label = new JLabel("Sexo: ");
        label.setBounds(10, 5, 300, 20);
        add(label);

    }

    public void radioButton() {
        
        radioButtonM = new JRadioButton("Masculino");
        radioButtonM.setBounds(45, 5, 87, 20);
        add(radioButtonM);

        radioButtonF = new JRadioButton("Feminino");
        radioButtonF.setBounds(130, 5, 100, 20);
        add(radioButtonF);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ExercicioE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 100);

        ExercicioE exercicioE = new ExercicioE();
        frame.add(exercicioE);

        frame.setVisible(true);
    }

}
