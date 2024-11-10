package com.cadastro.programador;

import java.util.Hashtable;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Conhecimento extends JPanel {

    private JLabel title;
    private JSlider conhecimento;
    private Hashtable<Integer, JLabel> labels;

    public Conhecimento() {
        setLayout(null);

        title();
        conhecimento();

    }

    private void title() {
        title = new JLabel("Nivel de conhecimento em teste de software:");
        title.setBounds(10, 0, 290, 20);
        add(title);
    }

    private void conhecimento() {
        labels = new Hashtable<>();

        labels.put(0, new JLabel("0"));
        labels.put(10, new JLabel("1"));
        labels.put(20, new JLabel("2"));
        labels.put(30, new JLabel("3"));

        conhecimento = new JSlider(0,30,15);
        conhecimento.setBounds(280, 0, 200, 45);
        conhecimento.setLabelTable(labels);
        conhecimento.setMajorTickSpacing(10);
        conhecimento.setMinorTickSpacing(1);
        conhecimento.setPaintTicks(true);
        conhecimento.setPaintLabels(true);
        add(conhecimento);
    }


}
