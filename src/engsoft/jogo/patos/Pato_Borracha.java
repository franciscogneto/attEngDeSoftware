package engsoft.jogo.patos;

public class Pato_Borracha extends Pato {

	public Pato_Borracha()
	{
		setComportamento(new Nao_Voa());		
	}
	
	public String mostrar() {
		return "Ol�, eu sou de Boarracha.";
	}
	
}
