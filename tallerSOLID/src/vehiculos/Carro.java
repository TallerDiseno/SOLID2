package vehiculos;

import DIPviolation.AsientoParaCarro;
import DIPviolation.LlantaParaCarro;
import LSPviolation.Radio;

public class Carro implements Vehiculo{
	//Esta clase va relacionada con varias violaciones de principios
	
	private LlantaParaCarro llanta1;
	private LlantaParaCarro llanta2;
	private LlantaParaCarro llanta3;
	private LlantaParaCarro llanta4;
	private AsientoParaCarro asiento1;
	private AsientoParaCarro asiento2;
	private Radio radio;
	
	public Carro() {
		llanta1 = new LlantaParaCarro();
		llanta2 = new LlantaParaCarro();
		llanta3 = new LlantaParaCarro();
		llanta4 = new LlantaParaCarro();
		asiento1 = new AsientoParaCarro();
		asiento2 = new AsientoParaCarro();
		radio = new Radio();
	}
	
	public void girarLlantaDelanteraIzquierdaAIzquierda() {
		
	}
	
	public void girarLlantaDelanteraDerechaAIzquierda() {
		
	}
	
	public void girarLlantaDelanteraIzquierdaADerecha() {
		
	}
	public void girarLlantaDelanteraDerechaADerecha() {
		
	}

	@Override
	public void escuchar() {
		if(!radio.isEncendida()) {
			return;
		}
		//Codigo para escuchar la radio
	}
}
