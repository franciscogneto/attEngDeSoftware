package engsoft.jogo.patos;

//Programação voltada a interface: pois implementa a interface Padrao_Voaveis
public class Correr implements Padrao_Correr {

	private double velocidade;

	public Correr(double velocidade) {
		this.velocidade = velocidade;
	}

	// Polimorfismo: subscreve o método correr() da interface Padrao_Correr
	public String correr() {
		return "Correndo. Velocidade: " + getVelocidade();
	}

	// Polimorfismo: subscreve o método getVelocidade() da interface Padrao_Correr
	public double getVelocidade() {
		return velocidade;
	}

}
