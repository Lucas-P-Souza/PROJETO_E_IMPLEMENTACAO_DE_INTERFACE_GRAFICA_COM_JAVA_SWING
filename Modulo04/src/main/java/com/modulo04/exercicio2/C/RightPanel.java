package com.modulo04.exercicio2.C;

import java.awt.*;
import javax.swing.*;

public class RightPanel extends JPanel {

    public RightPanel() {
        
        setLayout(new BorderLayout());

        ImageIcon imagemEIcon = new ImageIcon(getClass().getResource("imagem.jpg"));
        Image imagemE = imagemEIcon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        JLabel imagemELabel = new JLabel(new ImageIcon(imagemE));
        imagemELabel.setHorizontalAlignment(SwingConstants.CENTER);
        imagemELabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JButton carregarImagem = new JButton("Carregar imagem");

        add(imagemELabel, BorderLayout.CENTER);
        add(carregarImagem, BorderLayout.SOUTH);

        setPreferredSize(new Dimension(250, 300));
    }
}
