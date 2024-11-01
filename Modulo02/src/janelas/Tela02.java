package janelas;
import javax.swing.JOptionPane;

public class Tela02 {

	public Tela02(String nome) {
		
		if (nome != null && !nome.isEmpty()) {
			
            JOptionPane.showMessageDialog(
            		null, 
            		"Olá, " + nome + ", seja bem vindo ao módulo de interfaces gráficas do Java!"
            	);
            
        }
		else{
        	
            JOptionPane.showMessageDialog(
            		null, 
            		"Nenhum nome foi digitado."
            	);
            
        }
	}
	
}
