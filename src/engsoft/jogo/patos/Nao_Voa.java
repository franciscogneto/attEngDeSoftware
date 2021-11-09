package engsoft.jogo.patos;

//Programação voltada a interface: pois implementa a interface Padrao_Voaveis
public class Nao_Voa implements Padrao_Voaveis {

	
	public Nao_Voa()
	{
			
	}
	
	// Polimorfismo: subscreve o método voar() da interface Padrao_Voaveis
	public String voar() {
		return "Esse pato n�o Voa. Velocidade: " + getVelocidade();
	}

	// Polimorfismo: subscreve o método getVelocidade() da interface Padrao_Voaveis
	public double getVelocidade() {
		return 0;
	}

}
