package engsoft.jogo.patos;

public class Main {

	public static void main(String[] args) {
		Pato pt = new Pato_Ruivo();		
		Pato pato_corredor = new Pato_Corredor();
		Pato pato_maratonista = new Pato_Maratonista();

		System.out.println(pt.mostrar());
		System.out.println(pt.nadar());
		System.out.println(pt.comportamento());
		
		System.out.println(pato_corredor.mostrar());
		System.out.println(pato_corredor.nadar());
		System.out.println(pato_corredor.comportamento());
		
		System.out.println(pato_maratonista.mostrar());
		System.out.println(pato_maratonista.nadar());
		System.out.println(pato_maratonista.comportamento());

		
		
	}

}
