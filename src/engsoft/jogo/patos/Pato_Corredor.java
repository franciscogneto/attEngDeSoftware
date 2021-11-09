package engsoft.jogo.patos;

//Herança: Pois herda da Classe Pato, setando o comportamento no método contrutor
//Programação voltada a interface: pois implementa a interface Padrao_Grasnar
public class Pato_Corredor extends Pato implements Padrao_Grasnar {
    //Composição: Guarda um objeto como atributo
	protected Correr comportamento_pato;

	// Delegação: Pois seta o comportamento do Pato_Corredor como Correr
	public Pato_Corredor() {
		comportamento_pato = new Correr(10);
		comportamento();
	}

	//Polimorfismo: Implementou o método mostrar com o comportamento da classe Pato_Corredor
	public String mostrar() {
		return "Eu sou o Pato Corredor.";
	}

	//Polimorfismo: Implementou o método mostrar com o comportamento da classe Pato_Corredor
	public String comportamento() {
		return comportamento_pato.correr();
	}

	public String grasnar() {
		return "Que-Que.";

	}
}
