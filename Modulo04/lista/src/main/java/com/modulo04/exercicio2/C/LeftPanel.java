package com.modulo04.exercicio2.C;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

public class LeftPanel extends JPanel {

    public LeftPanel() {
        setLayout(new BorderLayout());

        // Título do texto
        JLabel tituloTexto = new JLabel("Título do texto", SwingConstants.LEFT);

        // Área de texto
        JTextArea areaTexto = new JTextArea(10, 20);
        areaTexto.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
                + "Etiam eget ligula eu lectus lobortis condimentum. Aliquam nonummy auctor massa.");
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        areaTexto.setEditable(false);

        // Painel para botões
        JPanel botoesPanel = new JPanel(new FlowLayout());
        JButton salvar = new JButton("Salvar");
        JButton cancelar = new JButton("Cancelar");
        JButton voltar = new JButton("Voltar");
        botoesPanel.add(salvar);
        botoesPanel.add(cancelar);
        botoesPanel.add(voltar);

        // Adicionando os componentes no painel principal
        add(tituloTexto, BorderLayout.NORTH);
        add(new JScrollPane(areaTexto), BorderLayout.CENTER);
        add(botoesPanel, BorderLayout.SOUTH);
    }
}
