package com.cadastro.programador;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Enviar extends JPanel {

    private JButton enviar;

    public Enviar() {
        setLayout(null);
        enviar();  // Chama o método para criar o botão
    }

    private void enviar() {
        
        //cria um ícone a partir de uma imagem
        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/com/cadastro/programador/imagens/carta.png"));
        
        //redimensiona o ícone
        Image img = originalIcon.getImage(); // Obtém a imagem a partir do ImageIcon
        Image resizedImg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH); // Redimensiona a imagem
        
        //cria um novo ImageIcon a partir da imagem redimensionada
        ImageIcon resizedIcon = new ImageIcon(resizedImg);
        
        //cria um botão com um ícone
        enviar = new JButton("Enviar Formulário", resizedIcon); 
        enviar.setBounds(10, 0, 200, 70);
        enviar.setHorizontalTextPosition(JButton.CENTER);
        enviar.setVerticalTextPosition(JButton.BOTTOM);
        add(enviar);
    }
}
