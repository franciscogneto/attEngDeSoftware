package engsoft.jogo.patos;

//Programação voltada a interface: pois implementa a interface Padrao_Voaveis
public class Voar_Foguete implements Padrao_Voaveis {

	private double velocidade;

	public Voar_Foguete() {
		velocidade = 1000;
	}

	// Polimorfismo: subcreve o método voar() da interface Padrao_Voaveis
	public String voar() {
		return "Voando como um foguete. Velocidade: " + getVelocidade();
	}

	// Polimorfismo: subcreve o método getVelocidade() da interface Padrao_Voaveis
	public double getVelocidade() {
		return velocidade;
	}
}
