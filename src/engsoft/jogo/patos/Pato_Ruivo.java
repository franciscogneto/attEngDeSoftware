package engsoft.jogo.patos;

//Herança: Pois herda da Classe Pato, setando o comportamento no método contrutor
//Programação voltada a interface: pois implementa a interface Padrao_Grasnar
public class Pato_Ruivo extends Pato implements Padrao_Grasnar {
	//Composição: Guarda um objeto como atributo
	protected Padrao_Voaveis comportamento_pato;

	// Delegação: Pois seta o comportamento do Pato_Ruivo como Voaveis_Asa
	public Pato_Ruivo() {
		comportamento_pato = new Voaveis_Asa();
		comportamento();
	}

	//Polimorfismo: Implementou o método mostrar com o comportamento da classe Pato_Ruivo
	public String mostrar() {
		return "Eu sou o Pato Ruivo.";
	}

	//Polimorfismo: Implementou o método mostrar com o comportamento da classe Pato_Ruivo
	public String comportamento() {
		return comportamento_pato.voar();
	}

	public String grasnar() {
		return "Que-Que.";

	}

}
