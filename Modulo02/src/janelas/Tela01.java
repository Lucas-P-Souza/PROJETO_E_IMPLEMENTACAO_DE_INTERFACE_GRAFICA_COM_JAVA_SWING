package janelas;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tela01 extends JFrame {
	
	public String perguntaNome() { 
		
		return JOptionPane.showInputDialog(
				null, 
				"Digite seu nome:"
			);
		
	}

}
