/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema04;

import paquete02.EquipoCelular;

/**
 *
 * @author USER
 */
public class Ejecutor {

    public static void main(String[] args) {
        // Creacion del objeto
        EquipoCelular ec = new EquipoCelular();
        //Valores de entrada
        String sisOp = "Android";
        String tamPantalla = "6.55";
        double costIni = 675.50;
        double iva = 0.12;
        String mac = "01:3A:1D:54:6B:32";
        String imei = "861536030196001";
        
        ec.establecerSistemaOperativo(sisOp);
        ec.establecerTamanoPantalla(tamPantalla);
        ec.establecerCostoInicial(costIni);
        ec.establecerIva(iva);
        ec.establecerMac(mac);
        ec.establecerImei(imei);
        
        ec.calcularIvaCostInicial();
        ec.calcularCostoFinal();
        
        //Presentacion en pantalla
        System.out.printf("\nEquipo Celular \n" + "\n Sistema Operativo : %s" + 
                "\n Tamaño de la Pantalla : %s in" + "\n Direccion MAC : %s" + 
                "\n Informacion IMEI : %s" + "\n Costo Inicial : $ %.2f" + 
                "\n Costo Final mas IVA : $ %.2f \n",ec.obtenerSistemaOperativo(),
                ec.obtenerTamanoPantalla(), ec.obtenerMac(), ec.obtenerImei(),
                ec.obtenerCostoInicial(), ec.obtenerCostoFinal());
    }
}
