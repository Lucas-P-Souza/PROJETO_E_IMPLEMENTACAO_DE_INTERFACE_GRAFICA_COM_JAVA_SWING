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
        // Carrega a imagem original
        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/com/cadastro/programador/imagens/carta.png"));
        
        // Redimensiona a imagem para um tamanho adequado (ex: 30x30 pixels)
        Image img = originalIcon.getImage(); // Obtém a imagem a partir do ImageIcon
        Image resizedImg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH); // Redimensiona a imagem
        
        // Cria o ImageIcon a partir da imagem redimensionada
        ImageIcon resizedIcon = new ImageIcon(resizedImg);
        
        // Cria o botão e define o ícone redimensionado
        enviar = new JButton("Enviar Formulário", resizedIcon); // Usando a imagem redimensionada
        enviar.setBounds(10, 0, 200, 70); // Define o tamanho e posição do botão
        enviar.setHorizontalTextPosition(JButton.CENTER);  // Alinha o texto no centro
        enviar.setVerticalTextPosition(JButton.BOTTOM);    // Coloca o texto abaixo do ícone
        add(enviar);  // Adiciona o botão ao painel
    }
}
