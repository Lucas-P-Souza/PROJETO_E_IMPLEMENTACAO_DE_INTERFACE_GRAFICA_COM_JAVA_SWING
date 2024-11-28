package com.modulo05.ex6;

import javax.swing.*;

public class MainFrame6 extends JFrame {
    private FormPanel formPanel;
    private InterestsPanel interestsPanel;
    private ObservationsPanel observationsPanel;

    public MainFrame6() {

        setTitle("Exercício 6");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(520, 530);
        setLocationRelativeTo(null);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        formPanel = new FormPanel();
        add(formPanel);


        interestsPanel = new InterestsPanel();
        add(interestsPanel);

        observationsPanel = new ObservationsPanel();
        add(observationsPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame6();
    }
}
