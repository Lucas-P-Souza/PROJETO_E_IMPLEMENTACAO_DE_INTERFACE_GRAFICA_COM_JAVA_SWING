package com.modulo03.lista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ExercicioG extends JPanel {

    private JLabel label1;
    private JTextField textField;
    private JLabel label2;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JButton button;

    public ExercicioG () {

        setLayout(null);

        label1();
        textField();
        label2();
        radioButton1();
        radioButton2();
        button();

    }

    public void label1() {
        
        label1 = new JLabel("Nome:");
        label1.setBounds(10, 10, 50, 20);
        add(label1);

    }

    public void textField() {

        textField = new JTextField();
        textField.setBounds(60, 10, 150, 20);
        add(textField);

    }

    public void label2() {

        label2 = new JLabel("Sexo:");
        label2.setBounds(225, 10, 50, 20);
        add(label2);

    }

    public void radioButton1() {

        radioButton1 = new JRadioButton("Masculino");
        radioButton1.setBounds(260, 10, 84, 20);
        add(radioButton1);

    }

    public void radioButton2() {

        radioButton2 = new JRadioButton("Feminino");
        radioButton2.setBounds(340, 10, 80, 20);
        add(radioButton2);

    }

    public void button() {

        button = new JButton("Salvar");
        button.setBounds(420, 10, 100, 20);
        add(button);

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("ExercicioG");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 100);

        ExercicioG exercicioG = new ExercicioG();
        frame.add(exercicioG);

        frame.setVisible(true);
        
    }
}
