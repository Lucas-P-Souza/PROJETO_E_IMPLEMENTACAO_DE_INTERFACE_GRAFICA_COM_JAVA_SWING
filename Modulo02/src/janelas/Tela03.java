package janelas;
import javax.swing.JOptionPane;

public class Tela03 {

	
	public Tela03(String nome) {
        String[] opcoes = {"Sim", "Não", "Cancelar"};

        int resposta = JOptionPane.showOptionDialog(
            null,
            nome + "! Você gosta de programar?",
            "Selecionar uma Opção",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );
        
        switch(resposta) {
		 
	        case 0:
	            JOptionPane.showMessageDialog(
	            		null, 
	            		"Então estude bem o Java Swing. Ele pode abrir várias portas para você"
	            	);
	            break;
	            
	        case 1:
	            JOptionPane.showMessageDialog(
	            		null, 
	            		"Que pena. Mas com as janelas você vai gostar"
	            	);
	            break;
            
        }
        
	}
	
}
