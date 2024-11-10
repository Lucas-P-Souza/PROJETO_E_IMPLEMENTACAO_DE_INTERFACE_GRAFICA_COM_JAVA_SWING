package com.modulo03.lista;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ExercicioI extends JPanel {
    
    JScrollPane scrollPane;
    JList<String> list;

    public ExercicioI() {

        setLayout(null);
        
        list();

    }

    public void list() {

        String[] data = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
        
        list = new JList<>(data);
        list.setBounds(30, 30, 100, 95);

        scrollPane = new JScrollPane(list);
        scrollPane.setBounds(30, 30, 100, 95);

        add(scrollPane);

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("ExercicioI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(180, 180);

        ExercicioI exercicioI = new ExercicioI();
        frame.add(exercicioI);

        frame.setVisible(true);

    }

}
