package engsoft.jogo.patos;

//Herança: Pois herda da Classe Pato, setando o comportamento no método contrutor
//Programação voltada a interface: pois implementa a interface Padrao_Grasnar
public class Pato_Ruivo extends Pato implements Padrao_Grasnar {

	// Delegação: Pois seta o comportamento do Pato_Ruivo como Voaveis_Asa
	public Pato_Ruivo() {
		setComportamento(new Voaveis_Asa());
	}

	public String mostrar() {
		return "Eu sou o Pato Ruivo.";
	}

	public String grasnar() {
		return "Que-Que.";

	}

}
