package com.modulo05;

import com.modulo05.ex1.MainFrame1;
import com.modulo05.ex2.MainFrame2;
import com.modulo05.ex3.MainFrame3;
import com.modulo05.ex4.MainFrame4;
import com.modulo05.ex5.MainFrame5;
import com.modulo05.ex6.MainFrame6;

public class App 
{
    public static void main( String[] args )
    {
        new MainFrame1();//vai começar branco, aí vc clica na cor que quer
        new MainFrame2();//vai começar com o texto "Questão 2", aí vc clica no botão que quer
        new MainFrame3();
        new MainFrame4();
        new MainFrame5();//o resultado vai aparecer no campo onde o usuário digita os números
        new MainFrame6();//vai aparecer no terminal
    }
}


/*
 * Exercício 1 - Modificação de Cor do Painel
 * Descrição: Modifique o background do painel conforme o botão clicado. Caso o
 * botão "Amarelo" for clicado, o painel ficará amarelo, caso o botão "Verde"
 * for clicado, o painel ficará verde e, caso o botão "Azul" for clicado, o
 * painel ficará azul.
 * 
 * Estrutura do projeto:
 * Main.java: Classe principal que inicia a aplicação.
 * ColorPanel.java: Painel que contém a lógica para mudança de cor.
 * ButtonPanel.java: Painel que contém os botões para selecionar as cores.
 * Exercício 2 - Modificação de Texto do Label
 * Descrição: Modifique o texto do JLabel conforme o botão clicado. Por exemplo,
 * se o botão "Java" for clicado, o JLabel deverá exibir o texto "Java".
 * 
 * Estrutura do projeto:
 * Main.java: Classe principal que inicia a aplicação.
 * TextPanel.java: Painel que contém o JLabel e a lógica para modificação do
 * texto.
 * ButtonPanel.java: Painel que contém os botões para selecionar o texto a ser
 * exibido.
 * Exercício 3 - Exibição de Mensagem no JOptionPane
 * Descrição: Crie uma janela com um JFrame e um botão. Quando o botão for
 * clicado, a mensagem do JLabel deverá ser exibida em uma janela do
 * JOptionPane.
 * 
 * Estrutura do projeto:
 * Main.java: Classe principal que inicia a aplicação.
 * MessageFrame.java: JFrame que contém o botão e o JLabel.
 * MessageHandler.java: Classe para manipulação do evento do botão e exibição do
 * JOptionPane.
 * Exercício 4 - Cálculo de Valores Numéricos
 * Descrição: Construa uma interface onde o usuário poderá inserir múltiplos
 * números através de um botão "OK". Quando o botão "EXIBIR" for clicado, devem
 * ser apresentados:
 * 
 * O maior valor digitado.
 * O menor valor digitado.
 * A média aritmética dos números digitados.
 * Estrutura do projeto:
 * Main.java: Classe principal que inicia a aplicação.
 * InputPanel.java: Painel para inserir os números e armazená-los.
 * ResultPanel.java: Painel que exibe os resultados (maior, menor, média).
 * NumberHandler.java: Classe para manipulação e cálculo dos números inseridos.
 * Exercício 5 - Calculadora Simples com ComboBox
 * Descrição: Interface onde o usuário digitará dois números seguidos (sem
 * espaço) no campo "VALORES" e escolherá uma operação no ComboBox ("Somar" ou
 * "Multiplicar"). Ao clicar no botão "CALCULAR", o resultado será mostrado
 * conforme a operação selecionada.
 * 
 * Estrutura do projeto:
 * Main.java: Classe principal que inicia a aplicação.
 * CalculatorPanel.java: Painel que contém os campos de entrada, ComboBox e
 * botão "CALCULAR".
 * OperationHandler.java: Classe para manipulação das operações selecionadas e
 * cálculo dos resultados.
 * Exercício 6 - Formulário de Dados
 * Descrição: Crie uma interface de formulário. Os dados inseridos devem ser
 * armazenados em memória e exibidos no terminal quando o botão "Inserir" for
 * clicado.
 * 
 * Estrutura do projeto:
 * Main.java: Classe principal que inicia a aplicação.
 * FormPanel.java: Painel contendo o formulário para entrada de dados.
 * DataHandler.java: Classe para manipulação e armazenamento dos dados
 * inseridos.
 */