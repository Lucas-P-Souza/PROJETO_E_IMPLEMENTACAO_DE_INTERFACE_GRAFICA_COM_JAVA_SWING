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
        setLayout(null); // Usando layout null para definir as posições manualmente

        // Definindo os campos de "Nome" e "CPF" com posições e tamanhos específicos
        nome();
        cpf();

        // Garantir que o painel tenha um tamanho adequado para os componentes
    }

    private void nome() {
        // Cria o campo de texto para "Nome"
        nomeField = new JTextField(15);
        nomeLabel = new JLabel("Nome:");

        // Define a posição e o tamanho do rótulo "Nome"
        nomeLabel.setBounds(10, 5, 100, 30); // Posição X=10, Y=5, largura=100, altura=30
        add(nomeLabel); // Adiciona o rótulo "Nome"

        // Define a posição e o tamanho do campo de texto "Nome"
        nomeField.setBounds(60, 10, 140, 20); // Posição X=60, Y=10, largura=140, altura=20
        add(nomeField); // Adiciona o campo de texto "Nome"
    }

    private void cpf() {
        // Cria o campo de texto para "CPF"
        cpfField = new JTextField(15);
        cpfLabel = new JLabel("CPF:");

        // Define a posição e o tamanho do rótulo "CPF"
        cpfLabel.setBounds(10, 30, 100, 30); // Posição X=10, Y=30, largura=100, altura=30
        add(cpfLabel); // Adiciona o rótulo "CPF"

        // Define a posição e o tamanho do campo de texto "CPF"
        cpfField.setBounds(60, 35, 140, 20); // Posição X=60, Y=35, largura=140, altura=20
        add(cpfField); // Adiciona o campo de texto "CPF"
    }

    // Getters e Setters
    public JTextField getNomeField() {
        return nomeField;
    }

    public void setNomeField(JTextField nomeField) {
        this.nomeField = nomeField;
    }

    public JTextField getCpfField() {
        return cpfField;
    }

    public void setCpfField(JTextField cpfField) {
        this.cpfField = cpfField;
    }

    public JLabel getNomeLabel() {
        return nomeLabel;
    }

    public void setNomeLabel(JLabel nomeLabel) {
        this.nomeLabel = nomeLabel;
    }

    public JLabel getCpfLabel() {
        return cpfLabel;
    }

    public void setCpfLabel(JLabel cpfLabel) {
        this.cpfLabel = cpfLabel;
    }
}
