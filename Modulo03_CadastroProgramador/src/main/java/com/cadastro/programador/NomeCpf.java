package com.cadastro.programador;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NomeCpf extends JPanel {

    private JTextField nomeField;
    private JTextField cpfField;
    private JLabel nomeLabel;
    private JLabel cpfLabel;

    public NomeCpf() {

        setLayout(null);

        nome();
        cpf();

    }

    private void nome() {
      
        nomeField = new JTextField(15);
        nomeLabel = new JLabel("Nome:");


        nomeLabel.setBounds(10, 5, 100, 30);
        add(nomeLabel);

       
        nomeField.setBounds(60, 10, 140, 20); 
        add(nomeField); 
    }

    private void cpf() {
        
        cpfField = new JTextField(15);
        cpfLabel = new JLabel("CPF:");

        
        cpfLabel.setBounds(10, 30, 100, 30);
        add(cpfLabel); 

        
        cpfField.setBounds(60, 35, 140, 20); 
        add(cpfField); 
    }

}
