/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRPsolution;

import ISPsolution.Maquinaria;


public class MaquinaMaquinaria implements Maquinaria {
    //La interface dentro de ISPviolation tiene metodos que esta clase tiene.
    //Despues de solucionar las violaciones de principios en este paquete y en el otro
    //puede relacionar sus clases e interfaces resultantes.

    private double energiaRestante; //Valor entre 00.00 y 100.00

    public MaquinaMaquinaria() {
        this.energiaRestante = 100.00;
    }

    public MaquinaMaquinaria(double energiaRestante) {
        this.energiaRestante = energiaRestante;
    }

    @Override
    public void fabricarCarro() {
//Codigo para fabricar carro
    }

    @Override
    public void fabricarBicicleta() {
//Codigo para fabricar bicicleta
    }

    @Override
    public void fabricarAsientoCarro() {
//Codigo para fabricar asiento de carro    
    }

    @Override
    public void fabricarAsientoBicicleta() {
//Codigo para fabricar asiento de bicicleta
    }

    @Override
    public void fabricarLlantaBicicleta() {
//Codigo para fabricar llanta de bicicleta
    }

    @Override
    public void fabricarLlantaCarro() {
//Codigo para fabricar asiento de carro
    }


}
