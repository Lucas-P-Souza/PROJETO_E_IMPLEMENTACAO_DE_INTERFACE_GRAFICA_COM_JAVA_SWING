package com.modulo03.lista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import java.awt.Color;

public class ExercicioH extends JPanel {

    private JTable table;

    public ExercicioH() {

        setLayout(null);

        table();

    }

    public void table() {

        String[] columns = { "Código", "Produto", "Descrição"};
        String[][] data = {
            { "Código", "Produto", "Descrição"},
            { "1123", "Pendrive", "Pendrive 32GB" },
            { "2323", "HD SSD", "256GB" },
            { "3333", "Memória RAM", "16GB" },
            { "2344", "CPU", "i7" }
        };

        table = new JTable(data, columns);
        table.setBounds(10, 10, 500, 80);
        
        table.setBorder(new LineBorder(Color.BLACK));

        table.setGridColor(Color.BLACK);
        table.setShowGrid(true);

        add(table);

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("ExercicioH");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 170);

        ExercicioH exercicioH = new ExercicioH();
        frame.add(exercicioH);

        frame.setVisible(true);

    }
}
