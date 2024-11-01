package janelas;
public class main {

	public static void main(String[] args) {
		
		Tela01 tela01 = new Tela01();
		String nome = tela01.perguntaNome();
		
		new Tela02(nome);
		
		new Tela03(nome);
		
		new Tela04();
		
	}

}
