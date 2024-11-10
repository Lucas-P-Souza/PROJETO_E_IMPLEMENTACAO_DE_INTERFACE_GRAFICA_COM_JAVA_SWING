package com.cadastro.programador;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

public class Data extends JPanel {

    private JLabel titleField;
    private JLabel dayLabel;
    private JLabel monthLabel;
    private JLabel yearLabel;

    private JSpinner dayField;
    private JSpinner monthField;
    private JSpinner yearField;

    public Data() {
        setLayout(null);

        title();
        day();
        month();
        year();
    }

    private void title() {
        titleField = new JLabel("Data Aniversário:");	
        titleField.setBounds(10, 0, 140, 20);
        add(titleField);
    }

    private void day() {
        dayLabel = new JLabel("Dia:");
        dayLabel.setBounds(15, 20, 60, 20);
        add(dayLabel);

        dayField = new JSpinner();
        dayField.setBounds(45, 22, 60, 20);
        add(dayField);
    }

    private void month() {
        monthLabel = new JLabel("Mês:");
        monthLabel.setBounds(15, 50, 60, 20);
        add(monthLabel);

        monthField = new JSpinner();
        monthField.setBounds(45, 52, 60, 20);
        add(monthField);
    }

    private void year() {
        yearLabel = new JLabel("Ano:");
        yearLabel.setBounds(15, 80, 60, 20);
        add(yearLabel);

        yearField = new JSpinner();
        yearField.setBounds(45, 82, 60, 20);
        add(yearField);
    }

}
