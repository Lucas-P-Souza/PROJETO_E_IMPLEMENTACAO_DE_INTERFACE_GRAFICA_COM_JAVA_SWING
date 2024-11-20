package com.modulo04.exercicio2.B;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutPanel extends JPanel {

    public BorderLayoutPanel() {
        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Título", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        add(titulo, BorderLayout.NORTH);

        JPanel menuEsquerda = new JPanel();
        menuEsquerda.setLayout(new BoxLayout(menuEsquerda, BoxLayout.Y_AXIS));
        menuEsquerda.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        String[] itensMenu = { "Cliente", "Produtos", "Vendas", "Arquivos" };
        for (String item : itensMenu) {
            JLabel label = new JLabel(item);
            label.setFont(new Font("Arial", Font.PLAIN, 16));
            menuEsquerda.add(label);
            menuEsquerda.add(Box.createRigidArea(new Dimension(0, 10)));
        }
        add(menuEsquerda, BorderLayout.WEST);

        JPanel propagandaDireita = new JPanel();
        propagandaDireita.setLayout(new BoxLayout(propagandaDireita, BoxLayout.Y_AXIS));
        propagandaDireita.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        String[] textosPropaganda = { "Área para", "propagan", "das" };
        for (String texto : textosPropaganda) {
            JLabel label = new JLabel(texto);
            label.setFont(new Font("Arial", Font.PLAIN, 16));
            propagandaDireita.add(label);
            propagandaDireita.add(Box.createRigidArea(new Dimension(0, 10)));
        }
        add(propagandaDireita, BorderLayout.EAST);

        JPanel gridCentral = new GridLayoutPanel();
        gridCentral.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        add(gridCentral, BorderLayout.CENTER);

        JLabel rodape = new JLabel("Rodapé", SwingConstants.CENTER);
        rodape.setFont(new Font("Arial", Font.PLAIN, 16));
        rodape.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        add(rodape, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(800, 500);
        janela.add(new BorderLayoutPanel());
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}
