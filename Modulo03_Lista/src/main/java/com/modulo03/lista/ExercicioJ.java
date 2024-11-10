package com.modulo03.lista;

import javax.swing.*;

public class ExercicioJ extends JPanel {

    private int porcentagem = 43;
    private JLabel label1;
    private JLabel label2;
    private JProgressBar progressBar;

    public ExercicioJ() {
        
        setLayout(null);

        label1();
        label2();
        progressBar();

    }

    public void label1() {

        label1 = new JLabel("Running a Long Task...");
        label1.setBounds(10, 10, 150, 20);
        add(label1);

    }

    public void label2() {

        label2 = new JLabel("Completed " + porcentagem + "%");
        label2.setBounds(10, 30, 150, 20);
        add(label2);

    }

    public void progressBar() {

        progressBar = new JProgressBar();
        progressBar.setValue(porcentagem);
        progressBar.setStringPainted(true);
        progressBar.setBounds(10, 50, 250, 20);
        add(progressBar);

    }

    public static void main(String[] args) {
        ExercicioJ exercicioJ = new ExercicioJ();

        Object[] options = {"Cancelar"};

        
        JOptionPane optionPane = new JOptionPane(
            exercicioJ,
            JOptionPane.INFORMATION_MESSAGE,
            JOptionPane.DEFAULT_OPTION,
            null,
            options,
            options[0]
        );

        JDialog dialog = optionPane.createDialog("Progress...");

        dialog.setSize(350, 170);

        dialog.setVisible(true);

    }
}
