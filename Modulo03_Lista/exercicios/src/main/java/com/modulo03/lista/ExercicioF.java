package com.modulo03.lista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExercicioF extends JPanel {

    JButton cacelar;
    JButton salvar;
    JButton enviar;

    public ExercicioF() {
        
        setLayout(null);

        botaoCancelar();
        botaoSalvar();
        botaoEnviar();

    }

    public void botaoCancelar() {

        cacelar = new JButton("Cancelar");
        cacelar.setBounds(10, 5, 100, 20);
        add(cacelar);

    }

    public void botaoSalvar() {

        salvar = new JButton("Salvar");
        salvar.setBounds(120, 5, 100, 20);
        add(salvar);

    }

    public void botaoEnviar() {

        enviar = new JButton("Enviar");
        enviar.setBounds(230, 5, 100, 20);
        add(enviar);

    }


    public static void main(String[] args) {
        
        JFrame frame = new JFrame("ExercicioF");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(355, 100);

        ExercicioF exercicioF = new ExercicioF();
        frame.add(exercicioF);

        frame.setVisible(true);
        
    }

}
