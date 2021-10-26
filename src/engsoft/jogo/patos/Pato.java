package engsoft.jogo.patos;

//Classe Abstrata: Pois possui pelo menos um método abstrato (mostrar()) e a classe não é instanciável. 
public abstract class Pato {

	protected Padrao_Voaveis comportamento_pato;

	// método abstrato: pois pode ser subcrito pelas classes que herdam a mesma
	abstract String mostrar();

	public String nadar() {
		return "Pato Nadando.";
	}

	// Composição da interface Padrao_Voaveis no atributo (comportamento_pato)
	public void setComportamento(Padrao_Voaveis padrao) {
		comportamento_pato = padrao;
	}

	public String comportamento_pato() {
		return comportamento_pato.voar();
	}
}
