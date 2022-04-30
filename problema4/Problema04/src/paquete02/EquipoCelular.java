/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author USER
 */
public class EquipoCelular {
    private String sistemaOperativo;
    private String tamanoPantalla;
    private double costoInicial;
    private double iva;
    private double ivaCostInicial;
    private double costoFinal;
    private String mac;
    private String imei;
    
    public void establecerSistemaOperativo(String c){
        sistemaOperativo = c;
    }
    
    public void establecerTamanoPantalla(String c){
        tamanoPantalla = c;
    }
    
    public void establecerCostoInicial(double c){
        costoInicial = c;
    }
    
    public void establecerIva(double c){
        iva = c;
    }
    
    public void calcularIvaCostInicial(){
        ivaCostInicial = costoInicial * iva;
    }
    
    public void calcularCostoFinal(){
        costoFinal = costoInicial + ivaCostInicial;
    }
    
    public void establecerMac(String c){
        mac = c;
    }
    
    public void establecerImei(String c){
        imei = c;
    }
    
    public String obtenerSistemaOperativo(){
        return sistemaOperativo;
    }
    
    public String obtenerTamanoPantalla(){
        return tamanoPantalla;
    }
    
    public double obtenerCostoInicial(){
        return costoInicial;
    }
    
    public double obtenerIva(){
        return iva;
    }
    
    public double obtenerIvaCostInicial(){
        return ivaCostInicial;
    }
    
    public double obtenerCostoFinal(){
        return costoFinal;
    }
    
    public String obtenerMac(){
        return mac;
    }
    
    public String obtenerImei(){
        return imei;
    }
}
