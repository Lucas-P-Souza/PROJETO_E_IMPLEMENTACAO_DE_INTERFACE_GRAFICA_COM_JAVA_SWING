package com.modulo03.lista;

import javax.swing.*;
import java.awt.*;

public class ExemploSwing {
    
    public static void main(String[] args) {
    
        JFrame frame = new JFrame("Exemplo de JButton e JTextField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(20);
        //MANIPULANDO VARIAVEIS DO TEXTFIELD
        textField.setBackground(Color.LIGHT_GRAY); //Muda a cor do textField
        textField.setText("Digite algo aqui"); //Muda o texto inicial do textField

        JButton button = new JButton("Texto do botão");
        //MANIPULANDO VARIAVEIS DO BOTÃO
        button.setText("Novo texto do botão"); //Muda o texto do botão
        button.setBackground(Color.LIGHT_GRAY); //Muda a cor do botão

        frame.add(textField);
        frame.add(button);

        frame.setVisible(true);

    }
}
