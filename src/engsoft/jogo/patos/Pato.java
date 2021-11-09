package engsoft.jogo.patos;

//Classe Abstrata: Pois possui pelo menos um método abstrato (mostrar()) e a classe não é instanciável. 
public abstract class Pato {

	// método abstrato: pois pode ser subcrito pelas classes que herdam a mesma
	abstract String mostrar();

	// método abstrato: pois pode ser subcrito pelas classes que herdam a mesma
	abstract String comportamento();

	public String nadar() {
		return "Pato Nadando.";
	}
}
