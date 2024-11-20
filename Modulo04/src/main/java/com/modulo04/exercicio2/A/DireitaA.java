package com.modulo04.exercicio2.A;

import java.awt.*;
import javax.swing.*;

public class DireitaA extends JPanel {

    public DireitaA() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel tituloLabel = new JLabel("Título", SwingConstants.CENTER);
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 16));
        tituloLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(tituloLabel, BorderLayout.NORTH);

        JPanel centralPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        centralPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        ImageIcon imagemEIcon = new ImageIcon(getClass().getResource("imagemE.jpg"));
        Image imagemE = imagemEIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH); // Redimensiona a imagem
        JLabel imagemELabel = new JLabel(new ImageIcon(imagemE));
        imagemELabel.setHorizontalAlignment(SwingConstants.CENTER);
        imagemELabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        centralPanel.add(imagemELabel);

        JTextArea textoCentral = new JTextArea(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
                        + "Etiam eget ligula eu lectus lobortis condimentum. Aliquam nonummy.");
        textoCentral.setLineWrap(true);
        textoCentral.setWrapStyleWord(true);
        textoCentral.setEditable(false);
        textoCentral.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textoCentral.setFont(new Font("Arial", Font.PLAIN, 12));
        textoCentral.setMargin(new Insets(10, 10, 10, 10));
        centralPanel.add(textoCentral);

        ImageIcon imagemDIcon = new ImageIcon(getClass().getResource("imagemD.png"));
        Image imagemD = imagemDIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH); // Redimensiona a imagem
        JLabel imagemDLabel = new JLabel(new ImageIcon(imagemD));
        imagemDLabel.setHorizontalAlignment(SwingConstants.CENTER);
        imagemDLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        centralPanel.add(imagemDLabel);

        add(centralPanel, BorderLayout.CENTER);

        JLabel rodapeLabel = new JLabel("Rodapé", SwingConstants.CENTER);
        rodapeLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(rodapeLabel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JFrame janela = new JFrame("Tela Direita");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(600, 400);
        janela.add(new DireitaA());
        janela.setVisible(true);
    }
}
