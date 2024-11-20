package com.modulo04.exercicio2.A;

import javax.swing.*;
import java.awt.*;

public class EsquerdaA extends JPanel {

    //Construtor da classe, organiza os campos A, B, C e D e o botão salvar
    public EsquerdaA() {
    
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        add(createField("Campo A:"));
        add(Box.createVerticalStrut(10));

        add(createField("Campo B:"));
        add(Box.createVerticalStrut(10));

        add(createField("Campo C:"));
        add(Box.createVerticalStrut(10));

        add(createField("Campo D:"));
        add(Box.createVerticalStrut(20));

        JButton salvarButton = new JButton("Salvar");
        salvarButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(salvarButton);
    }

    //cria os campos A, B, C e D
    private JPanel createField(String labelText) {

        JPanel fieldPanel = new JPanel(new BorderLayout());
        JLabel label = new JLabel(labelText);
        JTextField textField = new JTextField(15);
        fieldPanel.setLayout(new BoxLayout(fieldPanel, BoxLayout.X_AXIS));
        fieldPanel.add(label);
        fieldPanel.add(Box.createHorizontalStrut(10));
        fieldPanel.add(textField);

        return fieldPanel;

    }

    //main de teste
    public static void main(String[] args) {

        JFrame janela = new JFrame("Tela A");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300, 300);
        janela.add(new EsquerdaA());
        janela.setVisible(true);
        
    }
}
