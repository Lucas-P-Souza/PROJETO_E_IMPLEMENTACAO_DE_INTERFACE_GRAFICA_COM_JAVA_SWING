package com.modulo04.exercicio2.C;

import java.awt.*;
import javax.swing.*;

public class RightPanel extends JPanel {

    public RightPanel() {
        setLayout(new BorderLayout());

        // Carregar e redimensionar imagem
        ImageIcon imagemEIcon = new ImageIcon(getClass().getResource("imagem.jpg"));
        Image imagemE = imagemEIcon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        JLabel imagemELabel = new JLabel(new ImageIcon(imagemE));
        imagemELabel.setHorizontalAlignment(SwingConstants.CENTER);
        imagemELabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Botão para carregar imagem
        JButton carregarImagem = new JButton("Carregar imagem");

        // Adicionar componentes ao painel
        add(imagemELabel, BorderLayout.CENTER);
        add(carregarImagem, BorderLayout.SOUTH);

        // Definir tamanho preferido para aumentar a largura do painel
        setPreferredSize(new Dimension(250, 300)); // Largura = 250px, Altura = 300px
    }
}
