package engsoft.jogo.patos;

//Herança: Pois herda da Classe Pato, setando o comportamento no método contrutor
//Programação voltada a interface: pois implementa a interface Padrao_Grasnar
public class Pato_Maratonista extends Pato implements Padrao_Grasnar {
    //Composição: Guarda um objeto como atributo
	protected Correr comportamento_pato;

	// Delegação: Pois seta o comportamento do Pato_Maratonista como Correr
	public Pato_Maratonista() {
		comportamento_pato = new Correr(30);
		comportamento();
	}

	//Polimorfismo: Implementou o método mostrar com o comportamento da classe Pato_Maratonista
	public String mostrar() {
		return "Eu sou o Pato Maratonista.";
	}

	//Polimorfismo: Implementou o método mostrar com o comportamento da classe Pato_Maratonista
	public String comportamento() {
		return comportamento_pato.correr();
	}

	public String grasnar() {
		return "Que-Que.";

	}

}
