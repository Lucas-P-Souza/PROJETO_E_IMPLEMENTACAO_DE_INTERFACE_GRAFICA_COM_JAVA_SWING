package com.modulo05.ex4;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    int maior = 0;
    int menor = 0;
    int media = 0;
    int soma = 0;
    int cont = 0;

    public MyPanel() {

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        gbc.insets = new Insets(5, 5, 5, 5);

    
        JLabel maiorLabel = new JLabel("            Maior >>>>");
        JLabel menorLabel = new JLabel("            Menor >>>>");
        JLabel mediaLabel = new JLabel("            Média >>>>");

        JTextField maiorField = new JTextField(10);
        JTextField menorField = new JTextField(10);
        JTextField mediaField = new JTextField(10);

        JButton button = new JButton("Exibir");

        button.addActionListener(e -> {
            maiorField.setText(String.valueOf(maior));
            menorField.setText(String.valueOf(menor));
            mediaField.setText(String.valueOf(media));
        });

        JLabel label = new JLabel("Digite o número:");
        JTextField textField = new JTextField(10);
        JButton inputButton = new JButton("OK");

        inputButton.addActionListener(e -> {
            int input = Integer.parseInt(textField.getText());
            atualizar(input);
        });

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel(" "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(new JLabel(" "), gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        add(new JLabel(" "), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(label, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(new JLabel(" "), gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        add(new JLabel(" "), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(textField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(inputButton, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        add(new JLabel(" "), gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(maiorLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(maiorField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(menorLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        add(menorField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        add(mediaLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        add(mediaField, gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        add(button, gbc);
    }

    public void atualizar(int input) {
        if (cont == 0) {
            maior = input;
            menor = input;
            soma += input;
            cont++;
            media = soma / cont;
        } else {
            if (input > maior) {
                maior = input;
            }
            if (input < menor) {
                menor = input;
            }
            soma += input;
            cont++;
            media = soma / cont;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 4");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        MyPanel mainPanel = new MyPanel();

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
