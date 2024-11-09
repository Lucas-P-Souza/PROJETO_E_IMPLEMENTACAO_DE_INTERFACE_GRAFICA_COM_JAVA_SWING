package com.cadastro.programador;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class Vagas extends JPanel {

    private JLabel title;
    private JTable tabela;

    public Vagas() {

        setLayout(null);

        title();
        tabela();

    }

    private void title() {
        title = new JLabel("Vagas Disponíveis: ");
        title.setBounds(10, 5, 200, 20);
        add(title);
    }

    private void tabela() {
        String[] colunas = {"", ""};
        String[][] dados = {
            {"Back-end", "Front-end"},
            {"Java Spring", "React"},
            {"Python Rest API", "Vue.js"}
        };

        tabela = new JTable(dados, colunas);
        tabela.setBorder(new LineBorder(null, 2));
        tabela.setBounds(10, 30, 400, 48);  // Ajusta o tamanho e a posição da tabela
        add(tabela);
    }

}
