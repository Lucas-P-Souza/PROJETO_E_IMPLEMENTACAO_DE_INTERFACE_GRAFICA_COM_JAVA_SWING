package com.modulo04.exercicio2.C;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class LetraC extends JPanel {

    public LetraC() {
        JFrame frame = new JFrame("Interface Letra C");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout(10, 10));

        JLabel titulo = new JLabel("Título", SwingConstants.CENTER);
        titulo.setFont(titulo.getFont().deriveFont(18f));
        frame.add(titulo, BorderLayout.NORTH);

        JPanel painelCentral = new JPanel(new BorderLayout(10, 10));
        painelCentral.setBorder(new EmptyBorder(20, 20, 20, 20));

        LeftPanel leftPanel = new LeftPanel();
        painelCentral.add(leftPanel, BorderLayout.WEST);

        RightPanel rightPanel = new RightPanel();
        painelCentral.add(rightPanel, BorderLayout.EAST);

        frame.add(painelCentral, BorderLayout.CENTER);
        frame.setVisible(true);
    }

}
