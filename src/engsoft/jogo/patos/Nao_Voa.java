package engsoft.jogo.patos;

public class Nao_Voa implements Padrao_Voaveis {

	
	public Nao_Voa()
	{
			
	}
	
	public String voar() {
		return "Esse pato n�o Voa. Velocidade: " + getVelocidade();
	}

	public double getVelocidade() {
		return 0;
	}

}
