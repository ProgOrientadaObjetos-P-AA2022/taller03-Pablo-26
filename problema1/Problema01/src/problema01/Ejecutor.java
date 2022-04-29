/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

import Paquete02.Terreno;

/**
 *
 * @author UTPL
 */
public class Ejecutor {

    public static void main(String[] args) {
        // Creacion del objeto de tipo Terreno
        Terreno tr = new Terreno();
        //Valores de entrada
        double ancho = 52.70;
        double largo = 67.50;
        double valorMetro = 1.272;
        //Asignacion de valores a los atributos
        tr.establecerLargo(largo);
        tr.establecerAncho(ancho);
        tr.establecerValorMetroCuadrado(valorMetro);
        
        tr.calcularArea();
        tr.calcularCostoTerreno();
        
        //Presentacion en pantalla
        System.out.printf("\nCosto del Terreno: $ %.2f \n",tr.obtenerCostoTerreno());
    }
}
