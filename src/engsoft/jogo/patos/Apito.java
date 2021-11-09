package engsoft.jogo.patos;

/**
 * Classe de Apito que pode efetuar um grasno
 * Implementa��o da Interface
 * @author rodrigo.vieira
 */

 //Programação voltada a interface: pois implementa a interface Padrao_Grasnar
public class Apito implements Padrao_Grasnar{

	// Polimorfismo: subscreve o método grasnar() da interface Padrao_Grasnar
	public String grasnar()
	{		
		return "Queeeeee";
	}
}
