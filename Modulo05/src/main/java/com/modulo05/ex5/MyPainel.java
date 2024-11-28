package com.modulo05.ex5;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyPainel extends JPanel {

    public MyPainel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel label = new JLabel("Valores:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(label, gbc);

        JTextField textField = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(textField, gbc);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Somar");
        comboBox.addItem("Multiplicar");
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(comboBox, gbc);

        JButton button = new JButton("Calcular");
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        add(button, gbc);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText().trim();
                String[] parts = input.split(" ");

                if (parts.length != 2 || !parts[0].matches("\\d+") || !parts[1].matches("\\d+")) {
                    textField.setText("ERRO");
                    return;
                }

                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);
                String operation = (String) comboBox.getSelectedItem();

                if ("Somar".equals(operation)) {
                    textField.setText(String.valueOf(num1 + num2));
                } else if ("Multiplicar".equals(operation)) {
                    textField.setText(String.valueOf(num1 * num2));
                }
            }
        });
    }
}
