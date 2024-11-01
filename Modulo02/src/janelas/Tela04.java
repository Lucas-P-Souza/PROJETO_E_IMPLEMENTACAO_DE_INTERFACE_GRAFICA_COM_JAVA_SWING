package janelas;
import javax.swing.JOptionPane;

public class Tela04 {
	
	public Tela04() {
		
		String[] opcoes = {"Sim - Objeto é legal", "Não - Objeto é sofrimento", "Talvez - Quero aprender"};

        int resposta = JOptionPane.showOptionDialog(
            null,
            "Lembrete, aqui no Java Swing tudo é objeto. Você gosta disto?",
            "Atenção",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.WARNING_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );
        
        switch(resposta) {
   		
        	case 0:
	            JOptionPane.showMessageDialog(
	            		null, 
	            		"Ótimo, todos os componentes são objetos",
	            		"Mensagem",
	            		JOptionPane.INFORMATION_MESSAGE
	            	);
	            break;
	            
	        case 1:
	        	JOptionPane.showMessageDialog(
	        		    null,
	        		    "Não se preocupe! Agora você irá aprender a importância dos objetos",
	        		    "Mensagem",
	        		    JOptionPane.INFORMATION_MESSAGE
	        		);

	            break;
	            
	        case 2:
	            JOptionPane.showMessageDialog(
	            		null,
	            		"Sim, você aprenderá",
	            		"Mensagem",
	            		JOptionPane.INFORMATION_MESSAGE
	            	);
	            break; 
        
        }
		
	}

}
