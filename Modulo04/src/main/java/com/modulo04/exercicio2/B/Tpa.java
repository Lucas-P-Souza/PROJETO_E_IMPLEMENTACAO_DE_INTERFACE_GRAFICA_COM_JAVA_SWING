package com.modulo04.exercicio2.B;

import java.awt.*;
import javax.swing.*;

public class Tpa extends JPanel {

    public Tpa() {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel titulo = new JLabel("Título", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 14));
        titulo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        titulo.setPreferredSize(new Dimension(0, 100));
        titulo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));

        JLabel postagem = new JLabel("Postagem", SwingConstants.CENTER);
        postagem.setFont(new Font("Arial", Font.PLAIN, 18));
        postagem.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        postagem.setPreferredSize(new Dimension(0, 300));
        postagem.setMaximumSize(new Dimension(Integer.MAX_VALUE, 300));

        JLabel autor = new JLabel("Autor", SwingConstants.CENTER);
        autor.setFont(new Font("Arial", Font.BOLD, 14));
        autor.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        autor.setPreferredSize(new Dimension(0, 100));
        autor.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));

        add(titulo);
        add(postagem);
        add(autor);
    }

    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(800, 500);
        janela.add(new Tpa());
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}
