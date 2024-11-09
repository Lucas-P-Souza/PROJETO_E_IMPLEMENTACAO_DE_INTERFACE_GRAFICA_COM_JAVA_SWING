package com.cadastro.programador;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//classe do painel principal do programa
public class MeuPainel extends JFrame {

    public MeuPainel(String title){

        //passa o título da janela por meio do contrutor da classe pai
        super(title);

        //cria um painel para adicionar onde serão adicionados os componentes
        JPanel painel = new JPanel();

        //desabilita o layout padrão do painel para que possamos posicionar os componentes
        //permite que possamos usar o setBounds para posicionar os componentes
        painel.setLayout(null);

        //--------------------------------------------------------------------------------

        //cria o texto que será exibido no painel
        JLabel cdp = new JLabel("Cadastro de Programador");

        //posiciona o texto no painel
        cdp.setBounds(15, 5, 200, 30); 

        //adiciona o texto no painel
        painel.add(cdp);

        //--------------------------------------------------------------------------------

        //cria o um painel que contém o nome e o cpf
        NomeCpf nomeCpfPanel = new NomeCpf();

        //posiciona o painel NomeCpf no painel principal
        nomeCpfPanel.setBounds(10, 35, 400, 55);

        //adiciona o painel NomeCpf no painel principal
        painel.add(nomeCpfPanel);

        //--------------------------------------------------------------------------------

        //cria o um painel que contém a data
        Data dataPanel = new Data();

        //posiciona o painel Data no painel principal
        dataPanel.setBounds(10, 100, 400, 110); 

        //adiciona o painel Data no painel principal
        painel.add(dataPanel);

        //--------------------------------------------------------------------------------

        //cria o um painel que contém a apresentação
        Apresentacao apresentacaoPanel = new Apresentacao();

        //posiciona o painel Apresentacao no painel principal
        apresentacaoPanel.setBounds(10, 210, 400, 130);

        //adiciona o painel Apresentacao no painel principal
        painel.add(apresentacaoPanel);

        //--------------------------------------------------------------------------------

        //cria o um painel que contém o sexo
        Sexo sexoPanel = new Sexo();

        //posiciona o painel Sexo no painel principal
        sexoPanel.setBounds(10, 340, 500, 20);

        //adiciona o painel Sexo no painel principal
        painel.add(sexoPanel);

        //--------------------------------------------------------------------------------

        //cria o um painel que contém as linguagens
        Linguagens linguagensPanel = new Linguagens();

        //posiciona o painel Linguagens no painel principal
        linguagensPanel.setBounds(10, 365, 500, 20);

        //adiciona o painel Linguagens no painel principal
        painel.add(linguagensPanel);

        //--------------------------------------------------------------------------------

        //cria o um painel que contém o nível conhecimento
        Conhecimento conhecimentoPanel = new Conhecimento();

        //posiciona o painel Conhecimento no painel principal
        conhecimentoPanel.setBounds(10, 395, 500, 45); 

        //adiciona o painel Conhecimento no painel principal
        painel.add(conhecimentoPanel);

        //--------------------------------------------------------------------------------

        //cria o um painel que contém as vagas
        Vagas vagasPanel = new Vagas();

        //posiciona o painel Vagas no painel principal
        vagasPanel.setBounds(10, 430, 500, 80);

        //adiciona o painel Vagas no painel principal
        painel.add(vagasPanel); 

        //--------------------------------------------------------------------------------

        //cria o um painel que contém os tipos de programador
        Tipo tipoPanel = new Tipo();

        //posiciona o painel Tipo no painel principal
        tipoPanel.setBounds(10, 510, 500, 50);

        //adiciona o painel Tipo no painel principal
        painel.add(tipoPanel);

        //--------------------------------------------------------------------------------

        //cria o um painel que contém o botão de enviar
        Enviar enviarPanel = new Enviar();

        //posiciona o painel Enviar no painel principal
        enviarPanel.setBounds(10, 570, 500, 70);

        //adiciona o painel Enviar no painel principal
        painel.add(enviarPanel);

        //--------------------------------------------------------------------------------

        // Configurações da janela principal
        this.add(painel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 700); // Ajustei o tamanho da janela para uma altura menor
        setVisible(true);
    }
}
