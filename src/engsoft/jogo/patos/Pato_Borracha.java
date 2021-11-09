package engsoft.jogo.patos;

//Herança: Pois herda da Classe Pato, setando o comportamento no método contrutor
public class Pato_Borracha extends Pato {
	//Composição: Guarda um objeto como atributo
	protected Padrao_Voaveis comportamento_pato;

	public Pato_Borracha()
	{
		comportamento_pato = new Nao_Voa();
		comportamento();		
	}

	//Polimorfismo: Implementou o método mostrar com o comportamento da classe Pato_Borracha
	public String comportamento() {
		return comportamento_pato.voar();
	}
	
	//Polimorfismo: Implementou o método mostrar com o comportamento da classe Pato_Borracha
	public String mostrar() {
		return "Ol�, eu sou de Boarracha.";
	}
	
}
