/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

import paquete02.EquivalenteHora;

/**
 *
 * @author UTPL
 */
public class Ejecutor {

    public static void main(String[] args) {
        // Creacion del objeto de tipo EquivalenteHora
        EquivalenteHora eh = new EquivalenteHora();
        //valores de entrada
        double hora = 1000;
        //Asignacion de los valores a los atributos
        eh.establecerHora(hora);
        
        eh.calcularMinutos();
        eh.calcularSegundos();
        eh.calcularDias();
        
        //Presentacion en pantalla
        System.out.printf("\nCantidad de horas : %.2f" + "\nEquivalente en: " +
                "\n Minutos : %.2f" + "\n Segundos : %.2f" + "\n Días : %.2f \n",
                eh.obtenerHora(),eh.obtenerMinutos(),eh.obtenerSegundos(),
                eh.obtenerDias());
    }

}
