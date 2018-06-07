package SRPviolation;

import ISPviolation.Maquinaria;

public class MaquinaHaceTodo implements Maquinaria{
	//La interface dentro de ISPviolation tiene metodos que esta clase tiene.
	//Despues de solucionar las violaciones de principios en este paquete y en el otro
	//puede relacionar sus clases e interfaces resultantes.
	
	private double energiaRestante; //Valor entre 00.00 y 100.00
	
	public MaquinaHaceTodo() {
		this.energiaRestante = 100.00;
	}
	
	public MaquinaHaceTodo(double energiaRestante) {
		this.energiaRestante = energiaRestante;
	}
	
	public void imprimirInforme() {
		//Codigo para imprimir un Informe
	}
	
	public void servirCafe() {
		//Codigo para servir cafe
	}
	
	public void calentarHabitacion() {
		//Codigo para calentar habitacion
	}
	
	public void fabricarBicicleta() {
		//Codigo para fabricar bicicleta
	}
	
	public void fabricarCarro() {
		//Codigo para fabricar carro
	}

	@Override
	public void fabricarAsientoCarro() {
		//Codigo para fabricar asiento
	}

	@Override
	public void fabricarLlantaCarro() {
		//Codigo para fabricar llanta
	}

	@Override
	public void enfriarHabitacion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproducirMusicaGlobalmente() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void encenderLuces() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagarLuces() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void asegurarPuertas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fabricarAsientoBicicleta() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fabricarLlantaBicicleta() {
		// TODO Auto-generated method stub
		
	}
	
	
}
