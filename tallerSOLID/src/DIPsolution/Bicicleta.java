package DIPsolution;


public class Bicicleta implements Vehiculo{
	//Esta clase va relacionada con varias violaciones de principios
	
	private LlantaParaBicicleta llanta1;
	private LlantaParaBicicleta llanta2;
	private AsientoParaBicicleta asiento;
	private Campana campanilla;
	
	public Bicicleta() {
		Maquinaria m = new MaquinaDIP();
		m.fabricar(this);
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

	@Override
	public void fabricar() {
		Maquinaria m = new MaquinaDIP(); // Esta variable se la podría guardar por referencia en una superclase.
		llanta1 = (LlantaParaBicicleta) m.fabricar(new LlantaParaBicicleta());
		llanta2 = (LlantaParaBicicleta) m.fabricar(new LlantaParaBicicleta());
		asiento = (AsientoParaBicicleta) m.fabricar(new AsientoParaBicicleta());
		campanilla = (Campana) m.fabricar(new Campana());
	}
}
