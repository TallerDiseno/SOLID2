package DIPsolution;

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
		Maquinaria m = new MaquinaDIP();
		m.fabricar(this);
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
			radio.encender();
		}
		//Codigo para escuchar la radio
	}

	@Override
	public void fabricar() {
		Maquinaria m = new MaquinaDIP(); 
		// Si queremos cambiar de maquinaria, solo basta instanciar otra maquinaria que implemente esta interfaz
		llanta1 = (LlantaParaCarro) m.fabricar(new LlantaParaCarro());
		llanta2 = (LlantaParaCarro) m.fabricar(new LlantaParaCarro());
		llanta3 = (LlantaParaCarro) m.fabricar(new LlantaParaCarro());
		llanta4 = (LlantaParaCarro) m.fabricar(new LlantaParaCarro());
		asiento1 = (AsientoParaCarro) m.fabricar(new AsientoParaCarro());
		asiento2 = (AsientoParaCarro) m.fabricar( new AsientoParaCarro());
		radio = (Radio) m.fabricar(new Radio());
		System.out.print("Carro fabricado!");
	}
}
