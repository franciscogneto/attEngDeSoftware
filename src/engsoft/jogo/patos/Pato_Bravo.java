package engsoft.jogo.patos;

public class Pato_Bravo extends Pato implements  Padrao_Grasnar{

	public Pato_Bravo()	
	{
		setComportamento(new Voaveis_Asa());		
	}
	
	public String mostrar() {		
		return "Eu sou o Pato Bravo.";
	}

	public String grasnar() {
		return "Que-Que. Grrrrrrrrr.";
	}

}
