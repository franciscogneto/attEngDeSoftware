package engsoft.jogo.patos;

//Programação voltada a interface: pois implementa a interface Padrao_Voaveis
public class Voaveis_Asa implements Padrao_Voaveis {

	private double velocidade;

	public Voaveis_Asa() {
		velocidade = 10;
	}

	// Polimorfismo: subcreve o método voar() da interface Padrao_Voaveis
	public String voar() {
		return "Voando como um p�ssaro que voa. Velocidade: " + getVelocidade();
	}

	// Polimorfismo: subcreve o método getVelocidade() da interface Padrao_Voaveis
	public double getVelocidade() {
		return velocidade;
	}

}
