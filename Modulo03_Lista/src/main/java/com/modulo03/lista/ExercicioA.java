package com.modulo03.lista;

import javax.swing.*;

public class ExercicioA extends JPanel {

    public ExercicioA() {

        JLabel label = new JLabel("Interface Gráfica com Java Swing");
        add(label);

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("ExercicioA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        ExercicioA exercicioA = new ExercicioA();
        frame.add(exercicioA);

        frame.setVisible(true);

    }
}
