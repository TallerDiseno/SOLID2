package vehiculos;

import DIPviolation.AsientoParaBicicleta;
import DIPviolation.LlantaParaBicicleta;
import LSPviolation.Campana;

public class Bicicleta implements Vehiculo{
	//Esta clase va relacionada con varias violaciones de principios
	
	private LlantaParaBicicleta llanta1;
	private LlantaParaBicicleta llanta2;
	private AsientoParaBicicleta asiento;
	private Campana campanilla;
	
	public Bicicleta() {
		llanta1 = new LlantaParaBicicleta();
		llanta2 = new LlantaParaBicicleta();
		asiento = new AsientoParaBicicleta();
		campanilla = new Campana();
	}
	
	public void girarLlantaDelanteraAIzquierda() {
		//Codigo para girar llanta delantera a la izquierda
	}
	
	public void girarLlantaDelanteraADerecha() {
		//Codigo para girar llanta delantera a la izquierda
	}

	@Override
	public void escuchar() {
		campanilla.tintinear();
	}
}
