package OCPviolation;

import vehiculos.Bicicleta;
import vehiculos.Carro;

public class testeadorDeGiros {
	
	public void girarIzquierdaBicicleta(Bicicleta bicicleta) {
		bicicleta.girarLlantaDelanteraAIzquierda();
	}
	
	public void girarIzquierdaCarro(Carro carro) {
		carro.girarLlantaDelanteraIzquierdaAIzquierda();
		carro.girarLlantaDelanteraDerechaAIzquierda();
	}
	
	public void girarDerechaBicicleta(Bicicleta bicicleta) {
		bicicleta.girarLlantaDelanteraADerecha();
	}
	
	public void girarDerechaCarro(Carro carro) {
		carro.girarLlantaDelanteraIzquierdaADerecha();
		carro.girarLlantaDelanteraDerechaADerecha();
	}
}
